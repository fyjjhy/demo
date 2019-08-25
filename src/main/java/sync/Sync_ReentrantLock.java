package sync;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <Description> ReentrantLock可重入锁实现线程同步<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_ReentrantLock {
    private ReentrantLock lock = new ReentrantLock();

    public void execute() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " do something synchronized");
            anotherLock();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " interrupted");
            Thread.currentThread().interrupt();
        } finally {
           lock.unlock();
        }
    }

    public void anotherLock() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " invoke anotherLock");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Sync_ReentrantLock reentrantLock = new Sync_ReentrantLock();
//        new Thread(() -> {
//            reentrantLock.execute();
//        }).start();

        Thread t1 = new Thread(() -> {
            reentrantLock.execute();
        });

//        new Thread(() -> {
//            reentrantLock.execute();
//        }).start();

        Thread t2 = new Thread(() -> {
            reentrantLock.execute();
        });

        t1.start();
        t2.start();
    }
}
