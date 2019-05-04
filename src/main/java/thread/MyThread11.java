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
public class MyThread11 extends Thread {

    private DeadLock deadLock;

    public MyThread11(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    @Override
    public void run() {
        try {
            deadLock.rightLeft();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
