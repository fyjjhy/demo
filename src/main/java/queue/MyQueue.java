package queue;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <Description> 如何在Java中实现一个阻塞队列<br>
 * 考点：
 * 使用wait()和notify()方法实现阻塞队列
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月27日 <br>
 * @see queue <br>
 * @since V1.0 <br>
 */
public class MyQueue {

    // 1.需要一个承装元素的集合
    private LinkedList<Object> list = new LinkedList<>();

    // 2.需要一个计数器
    private AtomicInteger count = new AtomicInteger(0);

    // 3.需要指定上限和下限
    // 下限
    private final int minSize = 0;

    // 上限
    private final int maxSize;

    // 4.构造器
    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    // 5.初始化一个对象，用于加锁
    private final Object lock = new Object();

    // 将一个Object加到BlockingQueue里，如果BlockingQueue没有空间，则调用此方法的线程被阻断，
    // 直到BlockingQueue里面有空间在继续
    public void put(Object obj) {
        synchronized (lock) {
            while (count.get() == this.maxSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 1.加入元素
            list.add(obj);
            // 2.计数器累加
            count.incrementAndGet();
            // 3.通知另一个线程(唤醒)
            lock.notify();
            System.out.println("新加入的元素为：" + obj);
        }
    }

    // 取走BlockingQueue中排在首位的元素，若BlockingQueue为空，
    // 阻断进入等待状态直到BlockingQueue中有新的元素加入
    public Object take() {
        Object ret = null;
        synchronized (lock) {
            while (count.get() == this.minSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 1.移除元素操作
            ret = list.removeFirst();
            // 2.计数器递减
            count.decrementAndGet();
            // 3.唤醒另一个线程
            lock.notify();
        }
        return ret;
    }

    public int getSize() {
        return this.count.get();
    }

    public static void main(String[] args) {
        final MyQueue myQueue = new MyQueue(5);
        myQueue.put("a");
        myQueue.put("b");
        myQueue.put("c");
        myQueue.put("d");
        myQueue.put("e");
        System.out.println("当前容器长度：" + myQueue.getSize());
        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myQueue.put("f");
                myQueue.put("g");
            }
        }, "T1");

        T1.start();

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Object o1 = myQueue.take();
                System.out.println("移除的元素为:" + o1);
                Object o2 = myQueue.take();
                System.out.println("移除的元素为:" + o2);
            }
        }, "T2");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        T2.start();
    }
}
