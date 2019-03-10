//package redis;
//
//import org.apache.commons.lang.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.data.redis.connection.RedisConnection;
//import org.springframework.data.redis.core.RedisCallback;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
///**
// * <Description> <br>
// *
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年03月09日 <br>
// * @see redis <br>
// * @since V1.0 <br>
// */
//public class RedisLock {
//
//    private static Logger logger = LoggerFactory.getLogger(RedisLock.class);
//
//    private RedisTemplate redisTemplate;
//
//    private static final int DEFAULT_ACQUIRY_RESOLUTION_MILLIS = 100;
//
//    private String lockKey;
//
//    // 锁超时时间，防止线程在入锁以后，无限的执行等待
//    private int expireMsecs = 60 * 1000;
//
//    // 锁等待时间，防止线程饥饿
//    private int timeoutMsecs = 10 * 1000;
//
//    private volatile boolean locked = false;
//
//    public RedisLock(RedisTemplate redisTemplate, String lockKey) {
//        this.redisTemplate = redisTemplate;
//        this.lockKey = lockKey;
//    }
//
//    public RedisLock(RedisTemplate redisTemplate, String lockKey, int timeoutMsecs) {
//        this(redisTemplate, lockKey);
//        this.timeoutMsecs = timeoutMsecs;
//    }
//
//    public RedisLock(RedisTemplate redisTemplate, String lockKey, int expireMsecs, int timeoutMsecs) {
//        this(redisTemplate, lockKey, timeoutMsecs);
//        this.expireMsecs = expireMsecs;
//    }
//
//    public String getLockKey() {
//        return lockKey;
//    }
//
//    private String get(final String key) {
//        Object object = null;
//        try {
//            object = redisTemplate.execute(new RedisCallback() {
//                @Override
//                public Object doInRedis(RedisConnection redisConnection) {
//                    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//                    byte[] data = redisConnection.get(stringRedisSerializer.serialize(key));
//                    redisConnection.close();
//                    if (data == null) {
//                        return null;
//                    }
//                    return stringRedisSerializer.deserialize(data);
//                }
//            });
//        } catch (Exception e) {
//            logger.error("get redis error, key : {0}", key);
//        }
//        return object != null ? object.toString() : null;
//    }
//
//    private boolean setNX(final String key, final String value) {
//        Object object = null;
//        try {
//            object = redisTemplate.execute(new RedisCallback() {
//                @Override
//                public Object doInRedis(RedisConnection redisConnection) {
//                    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//                    Boolean success = redisConnection.setNX(stringRedisSerializer.serialize(key), stringRedisSerializer.serialize(value));
//                    redisConnection.close();
//                    return success;
//                }
//            });
//        } catch (Exception e) {
//            logger.error("setNX redis error, key : {0}", key);
//        }
//        return object != null ? (boolean) object : false;
//    }
//
//    private String getSet(final String key, final String value) {
//        Object object = null;
//        try {
//            object = redisTemplate.execute(new RedisCallback() {
//                @Override
//                public Object doInRedis(RedisConnection redisConnection) {
//                    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//                    byte[] ret = redisConnection.getSet(stringRedisSerializer.serialize(key), stringRedisSerializer.serialize(value));
//                    redisConnection.close();
//                    return stringRedisSerializer.deserialize(ret);
//                }
//            });
//        } catch (Exception e) {
//            logger.error("setNX redis error, key:{0}", key);
//        }
//        return object != null ? (String) object : null;
//    }
//
//    /**
//     * Description: <br>
//     * 获取lock
//     * 实现思路:主要使用redis的setNX命令，缓存了锁
//     * redis缓存的key是锁，value是锁的到期时间，
//     * 执行过程:
//     * 1.通过setNX尝试设置某个key的值，成功，则返回，成功获得锁
//     * 2.锁存在则获取锁的到期时间，和当前时间比较，超时的话，则设置新的值
//     * @author 付永杰<br>
//     * @taskId <br>
//     * @param
//     * @return <br>
//     */
//    public synchronized boolean lock() throws InterruptedException {
//        int timeout = timeoutMsecs;
//        while (timeout >= 0) {
//            long expires = System.currentTimeMillis() + expireMsecs + 1;
//            String expiresStr = String.valueOf(expires); // 锁到期时间
//            if (this.setNX(lockKey, expiresStr)) {
//                locked = true;
//                return true;
//            }
//
//            String currentValueStr = this.get(lockKey);
//            if (StringUtils.isNotEmpty(currentValueStr) && Long.parseLong(currentValueStr) < System.currentTimeMillis()) {
//                String oldValueStr = this.getSet(lockKey, expiresStr);
//                if (StringUtils.isNotEmpty(oldValueStr) && oldValueStr.equals(currentValueStr)) {
//                    locked = true;
//                    return true;
//
//                }
//
//            }
//            timeout -= DEFAULT_ACQUIRY_RESOLUTION_MILLIS;
//            Thread.sleep(DEFAULT_ACQUIRY_RESOLUTION_MILLIS);
//        }
//        return false;
//    }
//
//    public synchronized void unlock() {
//        if (locked) {
//            redisTemplate.delete(lockKey);
//            locked = false;
//        }
//    }
//}
