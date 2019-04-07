package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <Description> Semaphore<br>
 * 【描述】
 * 单个信号量的Semaphore对象可以实现互斥锁的功能，并且可以是由一个线程获得了"锁"，
 * 再由另一个线程释放"锁"，这可应用于死锁恢复的一些场合。
 * 【链接地址】
 * https://www.cnblogs.com/liuling/p/2013-8-20-03.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class SemaphoreDemo2 {

    public static void main(String[] args) {
        final Business business = new Business();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程" + Thread.currentThread().getName() + "正在执行...");
                    business.service();
                }
            });
        }
        executorService.shutdown();
    }

    private static class Business {

        private int count;

        Lock lock = new ReentrantLock();
        final Semaphore semaphore = new Semaphore(1);
        public void service() {
//            lock.lock();
            try {
//                System.out.println("线程" + Thread.currentThread().getName() + "获取锁");
                // 当前线程使用count变量的时候将其锁住，不允许其他线程访问
                semaphore.acquire();
                System.out.println("线程" + Thread.currentThread().getName() + "获取许可");
                System.out.println("此信号量中可用的许可数:" + semaphore.availablePermits());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(count);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            finally {
//                lock.unlock();
//                System.out.println("线程" + Thread.currentThread().getName() + "释放锁");
                // 释放锁
                semaphore.release();
                System.out.println("线程" + Thread.currentThread().getName() + "释放许可");
            }
        }

    }

//    线程pool-1-thread-1正在执行...
//    线程pool-1-thread-3正在执行...
//    线程pool-1-thread-2正在执行...
//    线程pool-1-thread-1获取许可
//    此信号量中可用的许可数:0
//            1
//    线程pool-1-thread-3获取许可
//    线程pool-1-thread-1释放许可
//    此信号量中可用的许可数:0
//            2
//    线程pool-1-thread-3释放许可
//    线程pool-1-thread-2获取许可
//    此信号量中可用的许可数:0
//            3
//    线程pool-1-thread-2释放许可
}
