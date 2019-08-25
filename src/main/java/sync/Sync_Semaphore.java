package sync;

import java.util.concurrent.Semaphore;

/**
 * <Description> Semaphore(信号量)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_Semaphore {
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " run.");
                    Thread.sleep(5000l);
                    semaphore.release();
                } catch (InterruptedException e) {
                    System.err.println(Thread.currentThread().getName() + " interrupted");
                }
            }).start();
        }
    }
}
