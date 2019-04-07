package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * <Description> Semaphore<br>
 * 【描述】
 *Semaphore也是一个线程同步的辅助类，可以维护当前访问自身的线程个数，并提供同步机制。
 * 使用Semaphore可以控制同时访问资源的线程个数，例如，实现一个文件允许的并发访问数
 * 【主要方法】
 * void acquire():从此信号量获取一个许可，在提供一个许可前一直将线程阻塞，否则线程被中断。
 * void release():释放一个许可，将其返回给信号量。
 * int availablePermits():返回此信号量中当前可用的许可数。
 * boolean hasQueuedThreads():查询是否有线程正在等待获取。
 * 【链接地址】
 * https://www.cnblogs.com/liuling/p/2013-8-20-03.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class SemaphoreDemo1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 创建信号量Semaphore，初始化许可大小为3
        final Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    // 请求获取许可，如果有可获得的许可则继续往下执行，许可数减1，否则进入阻塞状态
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程" + Thread.currentThread().getName() + "进入，当前已有" + (3 - semaphore.availablePermits()) + "个并发");
                    try {
                        Thread.sleep((long) (Math.random() * 10000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程" + Thread.currentThread().getName() + "即将离开");
                    // 释放许可，许可数加1
                    semaphore.release();
                    System.out.println("线程" + Thread.currentThread().getName() + "已离开，当前已有" + (3 - semaphore.availablePermits()) + "个并发");
                }
            };
            executorService.execute(runnable);
        }
    }
}
