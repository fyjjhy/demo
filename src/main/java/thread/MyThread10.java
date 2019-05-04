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
public class MyThread10 extends Thread {

    private DeadLock deadLock1;

    public MyThread10(DeadLock deadLock) {
        this.deadLock1 = deadLock;
    }

    @Override
    public void run() {
        try {
            deadLock1.leftRight();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
