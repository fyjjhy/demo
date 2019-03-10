package queue;

import java.util.PriorityQueue;

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
public class TestNonBlockingQueue {

    private int queueSize = 10;

    private PriorityQueue<Integer> queue = new PriorityQueue<Integer>(queueSize);

    public static void main(String[] args) {
        TestNonBlockingQueue testNonBlockingQueue = new TestNonBlockingQueue();
        Consumer consumer = testNonBlockingQueue.new Consumer();
        Producer producer = testNonBlockingQueue.new Producer();
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
                synchronized (queue) {
                    while (queue.size() == 0) {
                        try {
                            System.out.println("队列空，等待数据!");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notify();
                        }
                    }
                    queue.poll(); // 每次移走队首元素
                    queue.notify();
                    System.out.println("从队列取走一个元素，队列剩余" + queue.size() + "个元素");

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
                synchronized (queue) {
                    while (queue.size() == queueSize) {
                        try {
                            System.out.println("队列满，等待有剩余空间!");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notify();
                        }
                    }
                    queue.offer(1); // 每次插入一个元素
                    queue.notify();
                    System.out.println("向队列中插入一个元素，队列剩余空间:" + (queueSize - queue.size()));
                }
            }
        }
    }
 }
