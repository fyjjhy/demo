package lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <Description> tryLock()<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月11日 <br>
 * @see lock <br>
 * @since V1.0 <br>
 */
public class ReentrantLockDemo03 {

    private ArrayList<Integer> arrayList = new ArrayList<>();

    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ReentrantLockDemo03 reentrantLockDemo03 = new ReentrantLockDemo03();
        ReentrantLockDemo03.MyThread myThread01 = reentrantLockDemo03.new MyThread(reentrantLockDemo03);
        ReentrantLockDemo03.MyThread myThread02 = reentrantLockDemo03.new MyThread(reentrantLockDemo03);
        myThread01.start();
        myThread02.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        myThread02.interrupt();
    }

    public void insert(Thread thread) throws InterruptedException {
        // Lock lock = new ReentrantLock();
//        if (lock.tryLock()) {
//            try {
//                System.out.println(thread.getName() + "得到了锁");
//                for (int i = 0; i < 5; i++) {
//                    arrayList.add(i);
//                }
//            } catch (Exception e) {
//
//            }finally {
//                System.out.println(thread.getName() + "释放了锁");
//                for (Integer integer : arrayList) {
//                    System.out.println("遍历arrayList:" + integer);
//                }
//                lock.unlock();
//            }
//        }
//        else {
//            System.out.println(thread.getName() + "获取锁失败");
//        }
        lock.lockInterruptibly();
        try {
            System.out.println(thread.getName() + "得到了锁");
            for (int i = 0; i < 5; i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {

        }finally {
            for (Integer integer : arrayList) {
                System.out.println("遍历arrayList:" + integer);
            }
            lock.unlock();
            System.out.println(thread.getName() + "释放了锁");
        }
    }

    class MyThread extends Thread {
        private ReentrantLockDemo03 reentrantLockDemo03 = null;

        public MyThread(ReentrantLockDemo03 reentrantLockDemo03) {
            this.reentrantLockDemo03 = reentrantLockDemo03;
        }

        @Override
        public void run() {
            try {
                reentrantLockDemo03.insert(Thread.currentThread());
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被中断");
            }
        }
    }
}
