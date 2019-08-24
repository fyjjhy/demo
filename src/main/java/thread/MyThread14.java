package thread;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月22日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread14 extends Thread {

    public MyThread14(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        // 每隔1s中输出一次当前线程的名字
        while (true) {
            // 输出线程的名字，与主线程名称相区分
            printThreadInfo();
            try {
                // 线程休眠一秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new MyThread14("MyThread-1").start();

        new MyThread14("MyThread-2").start();

        // 演示主线程继续向下执行
        while (true) {
            printThreadInfo();
            Thread.sleep(1000);
        }
    }

    private static void printThreadInfo() {
        System.out.println("当前运行的线程的名字为：" + Thread.currentThread().getName());
    }
}
