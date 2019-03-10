package redis;

import redis.clients.jedis.Jedis;

import java.util.Collections;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月09日 <br>
 * @see redis <br>
 * @since V1.0 <br>
 */
public class RedisSetNXTest extends Thread {

    private static final String LOCK_SUCCESS = "OK";
    private static final String SET_IF_NOT_EXIST = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";
    private static final String GOODS_PRICE = "goodsPrice";
    private static final String THREAD_A001 = "A001";
    private static final String THREAD_B001 = "B001";

    private static int bidPrice = 100;

    private String auctionCode;

    public RedisSetNXTest(String auctionCode) {
        super(auctionCode);
        this.auctionCode = auctionCode;
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "主线程运行开始!");
        //更改key为a的值
        Jedis jedis=new Jedis("127.0.0.1",6379);
        jedis.set(GOODS_PRICE,"0");
        System.out.println("输出初始化值："+jedis.get(GOODS_PRICE));
        jedis.close();
        RedisSetNXTest thread1 = new RedisSetNXTest(THREAD_A001);
        RedisSetNXTest thread2  = new RedisSetNXTest(THREAD_B001);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "主线程运行结束!");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程运行开始 ");
        Jedis jedis=new Jedis("127.0.0.1",6379);
        try {
            if(THREAD_B001.equals(Thread.currentThread().getName())){
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //让A先拿到锁
        boolean isOk=  tryGetDistributedLock(jedis, "goods_lock", Thread.currentThread().getName() , 10000);

        try {
            if(THREAD_A001.equals(Thread.currentThread().getName())){
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(isOk) {
            System.out.println("子线程"+this.auctionCode +"拿到锁");
            String v =  jedis.get(GOODS_PRICE);
            Integer iv = Integer.valueOf(v);
            //条件都给过
            if(bidPrice > iv){

                Integer bp = iv + 100;
                //出价成功，事务未提交
                jedis.set(GOODS_PRICE,String.valueOf(bp));
                System.out.println("子线程"+this.auctionCode +", 出价："+ jedis.get(GOODS_PRICE) +"，出价时间："
                        + System.nanoTime());

            }else{
                System.out.println("出价低于现有价格！");
            }
            boolean isOk1=  releaseDistributedLock(jedis, "goods_lock", Thread.currentThread().getName());
            if(isOk1){
                System.out.println("子线程"+this.auctionCode +"释放锁");
            }

        }else{

            System.out.println("子线程" + auctionCode + "未拿到锁");
        }
        jedis.close();
        System.out.println(Thread.currentThread().getName() + "线程运行结束");
    }
    /**
     * 尝试获取分布式锁
     * @param jedis Redis客户端
     * @param lockKey 锁
     * @param requestId 请求标识
     * @param expireTime 超期时间
     * @return 是否获取成功
     */
    public boolean tryGetDistributedLock(Jedis jedis, String lockKey, String requestId, int expireTime) {

        String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);

        if (LOCK_SUCCESS.equals(result)) {
            return true;
        }
        return false;

    }

    private static final Long RELEASE_SUCCESS = 1L;

    /**
     * 释放分布式锁
     * @param jedis Redis客户端
     * @param lockKey 锁
     * @param requestId 请求标识
     * @return 是否释放成功
     */
    public  boolean releaseDistributedLock(Jedis jedis, String lockKey, String requestId) {

        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections
                .singletonList(requestId));

        if (RELEASE_SUCCESS.equals(result)) {
            return true;
        }
        return false;

    }
}
