package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月04日 <br>
 * @see thread <br>
 * @since https://www.cnblogs.com/frinder6/p/5507082.html <br>
 */
public class RunnableCallable implements Callable<String> {

    public RunnableCallable(String acceptStr) {
        this.acceptStr = acceptStr;
    }

    private String acceptStr;

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return this.acceptStr + "append some chars and return it!";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable = new RunnableCallable("my callable test!");
        FutureTask<String> task = new FutureTask<>(callable);
        long beginTime = System.currentTimeMillis();
        // 创建线程
        new Thread(task).start();
        // 调用get()阻塞主线程，反之，线程不会阻塞
        String result = task.get();
        long endTime = System.currentTimeMillis();
        System.out.println("hello:" + result);
        System.out.println("cast:" + (endTime - beginTime) / 1000 + "second!");
    }
}
