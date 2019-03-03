package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * <Description> 10次成功，10次失败，这是因为双缓冲队列的大小为10，入队10个元素后，则不能再有元素入队了<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestBlockingQueue {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        for (int i = 0; i < 20; i++) {
            try {
                // 设置5秒超时，5秒内元素仍没有入队到队列中，则返回false
                boolean flag = queue.offer(i + "", 5000, TimeUnit.MILLISECONDS);
                System.out.println("存入是否成功:" + flag);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
