package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestExecutorService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            Handler handler = new Handler();
            executorService.execute(handler);
        }

    }
}

class Handler implements Runnable {

    @Override
    public void run() {
        // 获取当前线程的名称
        String threadName = Thread.currentThread().getName();
        System.out.println("执行当前任务的线程为:" + threadName);
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + ":任务完毕!");
    }
}
