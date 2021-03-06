package thread;

/**
 * <Description> 创建两个对象导致对象锁由两个<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月02日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread9 implements Runnable {

    private static int temp = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread9());
        Thread thread2 = new Thread(new MyThread9());
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
