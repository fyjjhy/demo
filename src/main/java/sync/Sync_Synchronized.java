package sync;

/**
 * <Description> Synchronized关键字也支持可重入锁，是一种语法级别的同步方式，称为内置锁<br>
 * 内置锁可以作用在方法上，还可以作用到变量，静态方法上。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_Synchronized {
    public synchronized void execute() {
        System.out.println(Thread.currentThread().getName() + " do something synchronized");
        try {
            anotherLock();
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void anotherLock() {
        System.out.println(Thread.currentThread().getName() + " invoke anotherLock");
    }

    public static void main(String[] args) {
        Sync_Synchronized syncSynchronized = new Sync_Synchronized();
        Thread t1 = new Thread(() -> {
            syncSynchronized.execute();
        });

        Thread t2 = new Thread(() -> {
            syncSynchronized.execute();
        });

        t1.start();
        t2.start();
    }
}
