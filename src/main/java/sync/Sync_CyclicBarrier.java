package sync;

import common.DateConstant;
import utils.DateUtil.DateUtil;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <Description> CyclicBarrier<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_CyclicBarrier {
    public static void main(String[] args) {
        Random random = new Random();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                int secs = random.nextInt(10);
                System.out.println(Thread.currentThread().getName() + " " + DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "run, sleep" + secs + "secs");
                try {
                    Thread.sleep(secs * 1000);
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + " runs over!");
            }).start();
        }
    }
}
