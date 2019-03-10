package lock;

import redis.clients.jedis.Jedis;

import java.util.Collections;

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
public class MyLock2 {

    private static final Long RELEASE_SUCCESS = 1L;

    /**
     * Description: 释放分布式锁<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param jedis Redis客户端
     * @param lockKey 锁
     * @param requestId 请求标识
     * @return 是否释放成功
     */
    public static boolean releaseDistributedLock(Jedis jedis, String lockKey, String requestId) {
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections.singletonList(requestId));
        if (RELEASE_SUCCESS.equals(result)) {
            return true;
        }
        return false;
    }
}
