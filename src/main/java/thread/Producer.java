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
public class Producer implements Runnable {

    protected BlockingQueue<Object> queue;

    public Producer(BlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Object justProduced = getResource();
                queue.put(justProduced);
                System.out.println("生产者资源队列大小：" + queue.size());
            }
        } catch (InterruptedException e) {
            System.out.println("生产者中断");
        }
    }

    private Object getResource() {
        try {
            System.out.println("生产");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("生产者中断");
        }
        return new Object();
    }
}
