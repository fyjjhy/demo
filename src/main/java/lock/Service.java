package lock;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

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
public class Service {

    private static JedisPool jedisPool = null;

    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 设置最大连接数
        jedisPoolConfig.setMaxTotal(200);
        // 设置最大空闲数
        jedisPoolConfig.setMaxIdle(8);
        // 设置最大等待时间
        jedisPoolConfig.setMaxWaitMillis(1000 * 100);
        // 在borrow一个jedis实例时，是否需要验证，若为true，则所有jedis实例都是可用的
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPool = new JedisPool(jedisPoolConfig, "127.0.0.1", 6379, 3000);
    }

    DistributedLock distributedLock = new DistributedLock(jedisPool);

    int n = 500;

    public void seckill() {
        // 返回锁的value值，供释放锁时进行判断
        String identifier = distributedLock.lockWithTimeout("resource", 5000, 1000);
        System.out.println(Thread.currentThread().getName() + "获取了锁");
        System.out.println(--n);
        distributedLock.releaseLock("resource", identifier);
    }
}
