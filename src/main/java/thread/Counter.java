package thread;

import java.util.concurrent.CountDownLatch;

/**
 * <Description> num++<br>
 * 考点：
 * num++不是原子操作，而是复合操作
 * 操作过程：
 * 1.读取
 * 2.加一
 * 3.赋值
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月28日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class Counter {

    private static volatile int num = 0;

    // 使用CountDownLatch来等待计算线程执行完
    static CountDownLatch countDownLatch = new CountDownLatch(30);

    public static void main(String[] args) throws InterruptedException {
        // 开启30个线程进行累加操作
        for (int i = 0; i < 30; i++) {
            new Thread("线程" + i) {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        System.out.println(Thread.currentThread().getName() + "执行，num = " + num);
                        num++; // 自加操作
                    }
                    countDownLatch.countDown();
                }
            }.start();
        }

        // 等待计算线程执行完
        countDownLatch.await();
        System.out.println(num);
    }
}
