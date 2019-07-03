package thread;

/**
 * <Description> 加synchronized<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月02日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread8 implements Runnable {

    private static int temp = 0;

    public static void main(String[] args) {
        MyThread8 myThread8 = new MyThread8();
        Thread thread1 = new Thread(myThread8);
        Thread thread2 = new Thread(myThread8);
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        add();
    }

    private synchronized void add() {
        temp++;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " " + temp);
    }
}
