package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
public class MyThread22_ThreadPool {
    public static void main(String[] args) {
        // 创建固定大小的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
//        while (true) {
//            // 提交多个线程任务并执行
//            threadPool.execute(() -> {
//                printThreadInfo();
//            });
//        }

        // 提交多个线程任务并执行
        threadPool.execute(() -> {
            printThreadInfo();
        });
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
