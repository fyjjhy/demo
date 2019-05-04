package thread;

/**
 * <Description> 不加synchronized<br>
 *[关联]
 * MyThread7|MyThread8|MyThread9
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月02日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread7 implements Runnable {

    private static int temp = 0;

    public static void main(String[] args) {
        MyThread7 myThread7 = new MyThread7();
        Thread thread1 = new Thread(myThread7);
        Thread thread2 = new Thread(myThread7);
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        add();
    }

    private void add() {
        temp++;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " " + temp);
    }
}
