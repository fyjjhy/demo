package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <Description> 测试lockInterruptibly()的使用方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月06日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestLockInterruptibly {

    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        TestLockInterruptibly testLockInterruptibly = new TestLockInterruptibly();

        MyThread2 myThread2 = new MyThread2(testLockInterruptibly);
        MyThread2 myThread3 = new MyThread2(testLockInterruptibly);
        myThread2.start();
        myThread3.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread3.interrupt();
    }

    public void insert(Thread thread) throws InterruptedException {
        lock.lockInterruptibly(); // 如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将InterruptedException抛出
        try {
            System.out.println(thread.getName() + "得到了锁");
            long startTime = System.currentTimeMillis();
            for (;;) {
                if (System.currentTimeMillis() - startTime >= 10000) {
                    break;
                }
            }
        }
        finally {
            System.out.println(Thread.currentThread().getName() + "执行finally");
            lock.unlock();
            System.out.println(thread.getName() + "释放了锁");
        }
    }
}
