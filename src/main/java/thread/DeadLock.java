package thread;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月04日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class DeadLock {

    private final Object left = new Object();

    private final Object right = new Object();

    public void leftRight() throws InterruptedException {
        synchronized (left) {
            Thread.sleep(2000);
            synchronized (right) {
                System.out.println("leftRight end!");
            }
        }
    }

    public void rightLeft() throws InterruptedException {
        synchronized (right) {
            Thread.sleep(2000);
            synchronized (left) {
                System.out.println("rightLeft end!");
            }
        }
    }
}
