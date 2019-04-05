package queue;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * <Description> PriorityQueue<br>
 * 【线程安全】
 * PriorityQueue是非线程安全的
 * 【特征】
 * 1.PriorityQueue不允许null值
 * 2.入队和出队的时间复杂度O(log(n))
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月05日 <br>
 * @see queue <br>
 * @since V1.0 <br>
 */
public class PriorityQueueDemo2 {

    static final PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void add(int number) {
        if (!queue.contains(number)) {
            System.out.println(Thread.currentThread() + ":" + number);
            queue.add(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final PriorityQueueDemo2 priorityQueueDemo2 = new PriorityQueueDemo2();
        final Random random = new Random();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("t1开始运行...");
                for (int i = 0; i < 10; i++) {
                    priorityQueueDemo2.add(random.nextInt(10));
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("t2开始运行...");
                for (int i = 0; i < 10; i++) {
                    priorityQueueDemo2.add(random.nextInt(10));
                }
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println("t3开始运行...");
                for (int i = 0; i < 10; i++) {
                    priorityQueueDemo2.add(random.nextInt(10));
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("---------------运行结果---------------------");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
