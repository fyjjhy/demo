package lock;

import org.apache.commons.lang.StringUtils;
import redis.clients.jedis.Jedis;

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
public class MyLock {

    private static final String LOCK_SUCCESS = "OK";

    private static final String SET_IF_NOT_EXIST = "NX";

    private static final String SET_WITH_EXPIRE_TIME = "PX";

    /**
     * Description: 尝试获取分布式锁<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param jedis Redis客户端
     * @param lockKey 锁
     * @param requestId 请求标识
     * @param expireTime 超期时间
     * @return 是否获取成功
     */
    private static boolean tryGetDistributedLock(Jedis jedis, String lockKey, String requestId, int expireTime) {
        String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);

        if (LOCK_SUCCESS.equals(result)) {
            return true;
        }
        return false;
    }

    private static void wrongGetLock1(Jedis jedis, String lockKey, String requestId, int expireTime) {
        Long result = jedis.setnx(lockKey, requestId);
        if (result == 1) {
            // 若在这里程序突然崩溃，则无法设置过期时间，将发生死锁
            jedis.expire(lockKey, expireTime);
        }
    }

    private static boolean wrongGetLock2(Jedis jedis, String lockKey, int expireTime) {
        Long expires = System.currentTimeMillis() + expireTime;
        String expiresStr = String.valueOf(expires);
        // 如果当前锁不存在，返回加锁成功
        if (jedis.setnx(lockKey, expiresStr) == 1) {
            return true;
        }

        // 如果锁存在，获取锁的过期时间
        String currentValueStr = jedis.get(lockKey);
        if (StringUtils.isNotEmpty(currentValueStr) && Long.parseLong(currentValueStr) < System.currentTimeMillis()) {
            // 锁已过期，获取上一个锁的过期时间，并设置现在锁的过期时间
            String oldValueStr = jedis.getSet(lockKey, expiresStr);
            if (StringUtils.isNotEmpty(oldValueStr) && oldValueStr.equals(currentValueStr)) {
                return true;
            }
        }
        // 其他情况，一律返回加锁失败
        return false;
    }
}
