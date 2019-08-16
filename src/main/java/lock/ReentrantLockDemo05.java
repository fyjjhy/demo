package lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

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
public class ReentrantLockDemo05 {

    // private ArrayList<Integer> arrayList = new ArrayList<>();

    // private Lock lock = new ReentrantLock();

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final ReentrantLockDemo05 reentrantLockDemo02 = new ReentrantLockDemo05();
        new Thread("线程1") {
            @Override
            public void run() {
                reentrantLockDemo02.get(Thread.currentThread());
            }
        }.start();

        new Thread("线程2") {
            @Override
            public void run() {
                reentrantLockDemo02.get(Thread.currentThread());
            }
        }.start();
    }

    public void get(Thread thread) {
        reentrantReadWriteLock.readLock().lock();
        long start;
        try {
            start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName() + "正在进行读操作");
            }
            System.out.println(thread.getName() + "读操作完毕");
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
