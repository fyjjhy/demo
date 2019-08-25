package thread;

import java.util.PriorityQueue;

/**
 * <Description> 生产者-消费者模式<br>
 *通过阻塞队列和Object.wait()和Object.notify()实现。
 * wait()和notity()主要用于线程间通信。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月19日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class ProducerConsumerDemo02 {

    private int queueSize = 10;
    private PriorityQueue<Integer> queue = new PriorityQueue<>(queueSize);

    public static void main(String[] args) {
        ProducerConsumerDemo02 pc2 = new ProducerConsumerDemo02();
        Producer producer = pc2.new Producer();
        Consumer consumer = pc2.new Consumer();
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
                            System.out.println("队列空，等待数据。");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notify();
                        }
                    }
                    // 每次移走队首元素
                    queue.poll();
                    queue.notify();
                    System.out.println("从队列取走一个元素，队列剩余" + queue.size() + "个元素。");

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
                            System.out.println("队列满，等待有空余空间。");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notify();
                        }
                    }
                    // 每次插入一个元素
                    queue.offer(1);
                    queue.notify();
                    System.out.println("向队列中插入一个元素，队列剩余空间：" + (queueSize - queue.size()));
                }
            }
        }
    }
}
