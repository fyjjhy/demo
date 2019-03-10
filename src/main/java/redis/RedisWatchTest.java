package redis;

import org.apache.commons.collections.CollectionUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;

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
public class RedisWatchTest extends Thread {

    private static final String GOODS_PRICE = "goodsPrice";

    private String actionCode;

    public RedisWatchTest(String actionCode) {
        super(actionCode);
        this.actionCode = actionCode;
    }

    private static int bidPrice = 100;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ":主线程开始运行!");
        // 更改key为a的值
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set(GOODS_PRICE, "0");
        System.out.println("输出初始化值:" + jedis.get(GOODS_PRICE));
        jedis.close();
        RedisWatchTest thread1 = new RedisWatchTest("A001");
        RedisWatchTest thread2 = new RedisWatchTest("B001");
        thread1.start();
        thread2.start();
        try {
            thread1.join(); // 等待当前线程结束
            thread2.join(); // 等待当前线程结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "主线程运行结束!");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":线程运行开始!");
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        try {
            if ("B001".equals(Thread.currentThread().getName())) {
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 监视key
        jedis.watch(GOODS_PRICE);
        // A先进
        String v = jedis.get(GOODS_PRICE);
        Integer iv = Integer.valueOf(v);
        if (bidPrice > iv) {
            // 开启事务
            Transaction transaction = jedis.multi();
            Integer bp = iv + 100;
            // 出价成功，事务未提交
            transaction.set(GOODS_PRICE, String.valueOf(bp));
            System.out.println(Thread.currentThread().getName() + "子线程" + actionCode + "set成功!");
            try {
                if ("A001".equals(Thread.currentThread().getName())) {
                    sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<Object> list = transaction.exec();
            if (CollectionUtils.isEmpty(list) || list.size() == 0) {
                System.out.println(Thread.currentThread().getName() + "子线程" + actionCode + "出价失败");
            }
            else {
                System.out.println(Thread.currentThread().getName() + "子线程" + actionCode + "，出价：" + jedis.get(GOODS_PRICE) + "，出价时间：" + System.currentTimeMillis());
            }

        }
        else {
            System.out.println(Thread.currentThread().getName() + "出价低于现有价格!");
        }
        jedis.close();
        System.out.println(Thread.currentThread().getName() + "线程运行结束!");
    }
}
