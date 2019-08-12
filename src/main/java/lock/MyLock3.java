package lock;

import org.apache.commons.lang3.StringUtils;
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
public class MyLock3 {

    public static void wrongReleaseLock1(Jedis jedis, String lockKey) {
        jedis.del(lockKey);
    }

    public static void wrongReleaseLock2(Jedis jedis, String lockKey, String requestId) {
        // 判断加锁和解锁是否为同一个客户端
        if (StringUtils.isNotEmpty(requestId) && requestId.equals(jedis.get(lockKey))) {
            // 若此时，这把锁突然不是这个客户端的，则会误解锁
            jedis.del(lockKey);
        }
    }
}
