package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月12日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class ProducerConsumerDemo01 {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Object> queue = new LinkedBlockingQueue<Object>(5);
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

        Thread.sleep(1000);

        System.exit(0);
    }
}
