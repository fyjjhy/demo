package thread;

import java.util.concurrent.BlockingQueue;

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
public class Consumer implements Runnable {

    protected BlockingQueue<Object> queue;

    public Consumer(BlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Object object = queue.take();
                System.out.println("消费者资源队列大小：" + queue.size());
                take(object);
            }
        } catch (InterruptedException e) {
            System.out.println("消费者中断");
        }
    }

    private void take(Object object) {
        try {
            System.out.println("消费");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("消费者中断");
        }
        System.out.println("消费对象" + object);
    }
}
