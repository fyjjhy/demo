package sync;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <Description> Condition(条件对象)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_Condition {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " run。");
                System.out.println(Thread.currentThread().getName() + " wait for condition。");
                condition.await(); // 当前线程被挂起
                System.out.println(Thread.currentThread().getName() + " run to end。");
            } catch (InterruptedException e) {
                System.err.println(Thread.currentThread().getName() + "interrupted");
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " run。");
                System.out.println(Thread.currentThread().getName() + "sleep 5 seconds");
                try {
                    Thread.sleep(5000l);
                } catch (InterruptedException e) {
                    System.err.println(Thread.currentThread().getName() + " interrupted");
                    Thread.currentThread().interrupt();
                }
                condition.signalAll(); // t1线程重新被激活执行
            } finally {
                lock.unlock();
            }
        });

        t1.start();
        t2.start();
    }

    // 执行过程
    // t1调用Condition的await()之后，t1线程释放锁，然后加入到Condition的等待队列中。
    // t1释放锁，t2获得锁并执行
    // t2执行signal()之后，Condition等待队列中的t1被取出并加入到AQS中，t2执行完毕后释放锁
    // t1被唤醒，继续执行
}
