package sync;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_MySynchronizer extends AbstractQueuedSynchronizer {

    @Override
    protected boolean tryAcquire(int arg) {
        System.out.println(Thread.currentThread().getName() + " tryAcquire: " + arg);
        if (compareAndSetState(0, 1)) {
            setExclusiveOwnerThread(Thread.currentThread());
            return true;
        }
        return false;
    }

    @Override
    protected boolean tryRelease(int arg) {
        System.out.println(Thread.currentThread().getName() + " tryRelease: " + arg);
        setState(0);
        setExclusiveOwnerThread(null);
        return true;
    }

    public void lock() {
        acquire(1);
    }

    public void unlock() {
        release(1);
    }

    public static void main(String[] args) {
        Sync_MySynchronizer mySynchronizer = new Sync_MySynchronizer();
        new Thread(() -> {
            mySynchronizer.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " run.");
                System.out.println(Thread.currentThread().getName() + " will sleep 5 secs");
                try {
                    Thread.sleep(5000l);
                    System.out.println(Thread.currentThread().getName() + " continue.");
                } catch (InterruptedException e) {
                    System.err.println(Thread.currentThread().getName() + " interrupted");
                    Thread.currentThread().interrupt();
                }
            } finally {
                mySynchronizer.unlock();
            }
        }).start();

        new Thread(() -> {
            mySynchronizer.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " continue.");
            } finally {
                mySynchronizer.unlock();
            }
        }).start();
    }
}
