package thread;

/**
 * <Description> 匿名内部类的方式创建线程<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月22日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread17_Anonymous {
    public static void main(String[] args) {
        // 基于子类的方式
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    printThreadInfo();
                }
            }
        }.start();

        // 基本接口实现
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    printThreadInfo();
//                }
//            }
//        }).start();

        new Thread(() -> {
            while (true) {
                printThreadInfo();
            }
        }).start();
    }

    private static void printThreadInfo() {
        System.out.println("当前运行的线程名为： " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
