package sync;

/**
 * <Description> wait/notify<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_Wait_Notify {
    public synchronized void doWait() {
        System.out.println(Thread.currentThread().getName() + " run.");
        System.out.println(Thread.currentThread().getName() + " do something synchronized");
        try {
            this.wait();
            System.out.println(Thread.currentThread().getName() + " continue");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void doNotify() {
        try {
            System.out.println(Thread.currentThread().getName() + " run.");
            System.out.println(Thread.currentThread().getName() + " do something synchronized");
            Thread.sleep(5000l);
            this.notifyAll();
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + "interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Sync_Wait_Notify waitNotify = new Sync_Wait_Notify();
        new Thread(() -> {
            waitNotify.doWait();
        }).start();

        new Thread(() -> {
            waitNotify.doNotify();
        }).start();
    }
}
