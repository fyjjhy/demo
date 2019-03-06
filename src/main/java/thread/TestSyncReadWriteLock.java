package thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <Description> 测试ReentrantReadWriteLock使用方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月06日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestSyncReadWriteLock {

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        TestSyncReadWriteLock testSyncReadWriteLock = new TestSyncReadWriteLock();
        new Thread() {
            @Override
            public void run() {
                testSyncReadWriteLock.get(Thread.currentThread());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                testSyncReadWriteLock.get(Thread.currentThread());
            }
        }.start();
    }

//    public synchronized void get(Thread thread) {
//        long startTime = System.currentTimeMillis();
//
//        while ((System.currentTimeMillis() - startTime) <= 1) {
//            System.out.println(thread.getName() + "正在进行读操作");
//        }
//        System.out.println(thread.getName() + "读操作完毕!");
//    }

    public void get(Thread thread) {
        reentrantReadWriteLock.readLock().lock();
        try {
            long startTime = System.currentTimeMillis();

            while ((System.currentTimeMillis() - startTime) <= 1) {
                System.out.println(thread.getName() + "正在进行读操作");
            }
            System.out.println(thread.getName() + "读操作完毕!");
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
