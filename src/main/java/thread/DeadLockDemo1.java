package thread;

import DateUtil.DateUtil;
import common.DateConstant;

import java.util.concurrent.TimeUnit;

/**
 * <Description> 死锁<br>
 * 顺序死锁
 * 动态死锁
 * 协作死锁
 * 资源死锁
 * 【本质】
 * 都在等待被其他线程占有的资源而造成整个程序无法继续执行下去
 * 【降低死锁发生】
 * 1.尽可能减少锁的范围，比如使用同步代码块而不使用同步方法
 * 2.尽量不编写获取多个锁的代码，因为一个线程持有多个资源的时候很容易发生死锁
 * 3.根据情况将过大范围的锁进行切分，让每个所的作用范围减少，从而降低死锁发生概率。
 * 【饥饿】
 * 线程无法访问到它需要的资源而不能继续执行时。
 * 引发饥饿最常见资源就是CPU时钟周期。
 * 【活锁】
 * 线程不断重复执行相同的操作，但每次操作的结果都是失败的。
 * 尽管这个问题不会阻塞线程，但是程序也无法继续执行。
 * 【应用】
 * 活锁通常发生在处理事务消息的应用程序中，如果不能成功处理这个事务那么事务将回滚整个操作。
 * 【解决】
 * 每次重复执行的时候引入随机机制，
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月01日 <br>
 * @see thread <br>
 * @since https://blog.csdn.net/u011116672/article/details/51051352 <br>
 */
public class DeadLockDemo1 {

    public synchronized void tryOther(DeadLockDemo1 other) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() +
                "enter tryOther method at " + DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19));
        TimeUnit.SECONDS.sleep(3);
        System.out.println(Thread.currentThread().getName() +
                " tryOther method is about to invoke other method at " + DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19));
        other.other();
    }

    public synchronized void other() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() +
                " enter other method at " + DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19));
        TimeUnit.SECONDS.sleep(3);
    }

    public static void main(String[] args) throws InterruptedException {
        DeadLockDemo1 d1 = new DeadLockDemo1();
        DeadLockDemo1 d2 = new DeadLockDemo1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    d1.tryOther(d2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "threadA");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    d2.tryOther(d1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "threadB");
        t1.start();
        // 然A先执行
        TimeUnit.SECONDS.sleep(1);
        t2.start();

        // 运行10秒尝试中断
        TimeUnit.SECONDS.sleep(10);
        t1.interrupt();
        t2.interrupt();
        System.out.println("Is threadA is interrupted? " + t1.isInterrupted());
        System.out.println("Is threadB is interrupted? " + t2.isInterrupted());
    }
}
