package thread;

/**
 * <Description> 创建线程with lambda<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月22日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread16_Lambda {
    public static void main(String[] args) throws InterruptedException {
        // 使用lambda的形式实例化线程任务类
        Runnable task = () -> {
            while (true) {
                // 输出线程的名字
                printThreadInfo();
            }
        };
        // 创建线程对象,并将线程任务类作为构造方法参数传入
        new Thread(task).start();

        // 主线程的任务，为了演示多个线程一起执行
        while (true) {
            printThreadInfo();
            Thread.sleep(1000);
        }
    }

    private static void printThreadInfo() {
        System.out.println("当前运行的线程名为：" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
