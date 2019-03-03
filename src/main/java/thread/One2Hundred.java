package thread;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月02日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class One2Hundred {

    public static void main(String[] args) {
//        Thread thread1 = new Thread(new One2HundredThread1());
//        Thread thread2 = new Thread(new One2HundredThread2());
//        thread1.start();
//        thread2.start();\
//        Thread thread = new MyThread();
//        Thread thread1 = new MyThread();
//        thread.start();
//        thread1.start();
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };
        thread.start();
        thread1.start();
    }
}

//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 1; i <= 100; i++) {
//            Thread.currentThread();
//            System.out.println("当前线程:" + Thread.currentThread().getName() + ":" + i);
//        }
//    }
//}
