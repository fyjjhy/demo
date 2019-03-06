package thread;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月06日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread2 extends Thread {

    private TestLockInterruptibly testLockInterruptibly = null;

    public MyThread2(TestLockInterruptibly testLockInterruptibly) {
        this.testLockInterruptibly = testLockInterruptibly;
    }
    @Override
    public void run() {
        try {
            testLockInterruptibly.insert(Thread.currentThread());
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + "被中断了!");
        }
    }
}
