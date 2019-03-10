package semaphore;

import java.util.concurrent.Semaphore;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月10日 <br>
 * @see semaphore <br>
 * @since V1.0 <br>
 */
public class TestSemaphore {

    private static final int PERMITS = 5;

    private static final boolean FAIR = true;
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(PERMITS);

        semaphore = new Semaphore(PERMITS, FAIR);

        System.out.println("是否公平FIFO:" + semaphore.isFair());

        System.out.println("获取当前可用的许可证数量:" + semaphore.availablePermits());
        semaphore.acquire();
        System.out.println("获取当前可用的许可证数量:acquire 1个，剩下" + semaphore.availablePermits());
        semaphore.release();
        System.out.println("获取当前可用的许可证数量:release 1个，剩下" + semaphore.availablePermits());
        semaphore.acquire(2);
        System.out.println("获取当前可用的许可证数量:acquire 2个，剩下" + semaphore.availablePermits());
        semaphore.release(2);
        System.out.println("获取当前可用的许可证数量:release 2个，剩下" + semaphore.availablePermits());
        System.out.println("是否有正在等待许可证的线程:" + semaphore.hasQueuedThreads());
        System.out.println("正在等待许可证的队列长度(线程数量):" + semaphore.getQueueLength());
        Thread.sleep(10);
        System.out.println();
        Semaphore finalSemaphore = semaphore;
        new Thread(() -> {
            int permits = finalSemaphore.drainPermits();
            System.out.println(Thread.currentThread().getName() + "获取了剩余的全部" + permits + "个许可证");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 释放所有的许可证
            finalSemaphore.release(permits);
            System.out.println(Thread.currentThread().getName() + "释放了" + permits + "个许可证");
        }).start();

        new Thread(() -> {
            // 有一个线程正在等待获取一个许可证
            try {
                finalSemaphore.acquire();
                System.out.println(Thread.currentThread().getName() + "获取了一个许可证");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 释放一个许可证
            finalSemaphore.release();
            System.out.println(Thread.currentThread().getName() + "释放了一个许可证");
        }).start();
        Thread.sleep(10);
        System.out.println();
        System.out.println("获取当前可用的许可证数量:drain剩余的---" + finalSemaphore.availablePermits());
        System.out.println("是否有正在等待许可证的线程:" + finalSemaphore.hasQueuedThreads());
        System.out.println("正在等待许可证的队列长度(线程数量):" + finalSemaphore.getQueueLength());
        System.out.println();
        Thread.sleep(10);
        new Thread(() -> {
            try {
                // 有一个线程正在等待获取2个许可证
                finalSemaphore.acquire(2);
                System.out.println(Thread.currentThread().getName() + "获取2个许可证");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 释放2个许可证
            finalSemaphore.release(2);
            System.out.println(Thread.currentThread().getName() + "释放了2个许可证");
        }).start();
        Thread.sleep(10);
        System.out.println();
        System.out.println("获取当前可用的许可证数量:drain剩余的---" + finalSemaphore.availablePermits());
        System.out.println("是否有正在等待许可证的线程:" + finalSemaphore.hasQueuedThreads());
        System.out.println("正在等待许可证的队列长度(线程数量):" + finalSemaphore.getQueueLength());
        System.out.println();

        Thread.sleep(5000);
        System.out.println();
        System.out.println("获取当前可用的许可证数量:drain剩余的---" + finalSemaphore.availablePermits());
        System.out.println("是否有正在等待许可证的线程:" + finalSemaphore.hasQueuedThreads());
        System.out.println("正在等待许可证的队列长度(线程数量):" + finalSemaphore.getQueueLength());
    }
}
