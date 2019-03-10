package lock;

import org.apache.commons.collections.CollectionUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;
import redis.clients.jedis.exceptions.JedisException;

import java.util.List;
import java.util.UUID;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月09日 <br>
 * @see lock <br>
 * @since V1.0 <br>
 */
public class DistributedLock {

    private final JedisPool jedisPool;

    public DistributedLock(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    /**
     * Description: 加锁<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param lockName 锁的key
     * @param acquireTimeout 获取超时时间
     * @param timeout 锁的超时时间
     * @return 锁的value
     */
    public String lockWithTimeout(String lockName, long acquireTimeout, long timeout) {
        Jedis conn = null;
        String retIdentifier = null;
        try {
            // 获取连接
            conn = jedisPool.getResource();
            // 随机生成一个value
            String identifier = UUID.randomUUID().toString();
            // 锁名，即key值
            String lockKey = "lock:" + lockName;
            // 设置超时时间，上锁后超过此时间则自动释放锁
            int lockExpire = (int) (timeout / 1000);
            // 获取锁的超时时间，超过这个时间则放弃获取锁
            long end = System.currentTimeMillis() + acquireTimeout;
            while (System.currentTimeMillis() < end) {
                if (conn.setnx(lockKey, identifier) == 1) {
                    conn.expire(lockKey, lockExpire);
                    // 返回value值，用于释放锁时间确认
                    retIdentifier = identifier;
                    return retIdentifier;
                }

                // 返回-1:key没有设置超时时间，为key设置一个超时时间
                if (conn.ttl(lockKey) == -1) {
                    conn.expire(lockKey, lockExpire);
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (JedisException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return retIdentifier;
    }

    /**
     * Description: 释放锁<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param lockName 锁的key
     * @param identifier 释放锁的标识
     * @return <br>
     */
    public boolean releaseLock(String lockName, String identifier) {
        Jedis jedis = null;
        String lockKey = "lock:" + lockName;
        boolean retFlag = false;
        try {
            jedis = jedisPool.getResource();
            while (true) {
                // 监视lock，准备开始事务
                jedis.watch(lockKey);
                // 通过前面返回的value值判断是不是该锁，若是该锁，则删除，释放锁
                if (identifier.equals(jedis.get(lockKey))) {
                    Transaction transaction = jedis.multi();
                    transaction.del(lockKey);
                    List<Object> results = transaction.exec();
                    if (CollectionUtils.isEmpty(results)) {
                        continue;
                    }
                    retFlag = true;
                }
                jedis.unwatch();
                break;
            }
        } catch (JedisException e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return retFlag;
    }
}
