package queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月10日 <br>
 * @see queue <br>
 * @since V1.0 <br>
 */
public class TestBlockingQueue {

    private int queueSize = 10;

    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    public static void main(String[] args) {
        TestBlockingQueue testBlockingQueue = new TestBlockingQueue();
        Producer producer = testBlockingQueue.new Producer();
        Consumer consumer = testBlockingQueue.new Consumer();
        producer.start();
        consumer.start();
    }

    class Consumer extends Thread {
        @Override
        public void run() {
            consume();
        }

        private void consume() {
            while (true) {
                try {
                    queue.take();
                    System.out.println("从队列中取走一个元素，队列剩余" + queue.size() + "个元素!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Producer extends Thread {
        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while (true) {
                try {
                    queue.put(1);
                    System.out.println("向队列中插入一个元素，队列剩余空间:" + (queueSize - queue.size()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
