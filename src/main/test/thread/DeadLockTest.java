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
public class DeadLockTest {

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        MyThread10 myThread10 = new MyThread10(deadLock);
        MyThread11 myThread11 = new MyThread11(deadLock);
        myThread10.start();
        myThread11.start();
        while (true);
    }
}
