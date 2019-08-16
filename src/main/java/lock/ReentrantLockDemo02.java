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
public class ReentrantLockDemo02 {

    private ArrayList<Integer> arrayList = new ArrayList<>();

    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ReentrantLockDemo02 reentrantLockDemo02 = new ReentrantLockDemo02();
        new Thread("线程1") {
            @Override
            public void run() {
                reentrantLockDemo02.insert(Thread.currentThread());
            }
        }.start();

        new Thread("线程2") {
            @Override
            public void run() {
                reentrantLockDemo02.insert(Thread.currentThread());
            }
        }.start();
    }

    public void insert(Thread thread) {
        // Lock lock = new ReentrantLock();
        if (lock.tryLock()) {
            try {
                System.out.println(thread.getName() + "得到了锁");
                for (int i = 0; i < 5; i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {

            }finally {
                System.out.println(thread.getName() + "释放了锁");
                for (Integer integer : arrayList) {
                    System.out.println("遍历arrayList:" + integer);
                }
                lock.unlock();
            }
        }
        else {
            System.out.println(thread.getName() + "获取锁失败");
        }
    }
}
