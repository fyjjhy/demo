package sync;

import common.DateConstant;
import utils.DateUtil.DateUtil;

import java.util.concurrent.CountDownLatch;

/**
 * <Description> CountDownLatch(计数器)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_CountDownLatch {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " " + DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + " run.");
                try {
                    Thread.sleep(5000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println(Thread.currentThread().getName() + " continue.");
            }).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all thread over!");
    }
}
