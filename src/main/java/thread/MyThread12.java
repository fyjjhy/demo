package thread;

/**
 * <Description> 竞态条件<br>
 * 多个线程竞争同一资源，对资源的执行顺序敏感，称存在竞态条件。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月18日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread12 extends Thread {
    public static int index;
    @Override
    public void run() {
        for (int i = 0; i< 10; i++) {
            System.out.println(getName() + ":" + index++);
        }
    }

    public static void main(String[] args) {
        MyThread12 myThread1 = new MyThread12();
        MyThread12 myThread2 = new MyThread12();
        myThread1.start();
        myThread2.start();
    }
}
