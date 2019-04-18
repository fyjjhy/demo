package lock;

import utils.DateUtil.DateUtil;
import common.DateConstant;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月10日 <br>
 * @see lock <br>
 * @since V1.0 <br>
 */
public class TestDeadLock2 {

    private static String obj1 = "obj1";

    private static final Semaphore a1 = new Semaphore(1);
    private static final Semaphore b1 = new Semaphore(1);

    private static String obj2 = "obj2";

    public static void main(String[] args) {
        TestDeadLock2 testDeadLock2 = new TestDeadLock2();
        Lock1 lock1 = testDeadLock2.new Lock1();
        Lock2 lock2 = testDeadLock2.new Lock2();
        Thread a1 = new Thread(lock1);
        Thread b1 = new Thread(lock2);
        a1.start();
        b1.start();
    }

    class Lock1 implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock1 开始执行");
                while (true) {
                    /** 当前线程在限定的时间内，阻塞的尝试去获取1个许可证
                     *  此过程是阻塞的，他会一直等待许可证，直到发生一下任意一件事:
                     *  当前线程获取了可用的许可证，则会停止等待，继续执行，并返回true。
                     *  当前线程等待时间timeout超时，则会停止等待，继续执行，并返回false。
                     *  当前线程在timeout时间内被中断，则会抛出InterruptedException一次，并停止等待，继续执行
                     * */
                    if (TestDeadLock2.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock1 锁住obj1");
                        if (TestDeadLock2.b1.tryAcquire(1, TimeUnit.SECONDS)) {
                            System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock1 锁住了obj2");
                            Thread.sleep(60 * 1000); // do something
                        }
                        else {
                            System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock1 锁 obj2 失败");
                        }
                    }
                    else {
                        System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock1 锁 obj1 失败");
                    }
                    /** 当前线程释放一个可用的许可证*/
                    TestDeadLock2.a1.release(); // 释放
                    System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock1 释放 obj1");
                    TestDeadLock2.b1.release();
                    System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock1 释放 obj2");
                    Thread.sleep(1000); // 马上进行尝试，现实情况下do something是不确定的
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Lock2 implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock2 开始执行");
                while (true) {
                    if (TestDeadLock2.b1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock2 锁住了obj2");
                        if (TestDeadLock2.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                            System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock2 锁住了obj1");
                            Thread.sleep(60 * 1000); // do something
                        }
                        else {
                            System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock2 锁 obj1 失败");
                        }
                    }
                    else {
                        System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock2 锁obj2 失败");
                    }
                    TestDeadLock2.b1.release(); // 释放
                    System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock2 释放 obj2");
                    TestDeadLock2.a1.release();
                    System.out.println(DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19) + "Lock2 释放 obj1");
                    Thread.sleep(10 * 1000); // 这里只是为了演示，所以tryAcquire只用1秒，而且B要给A让出能执行的时间，否则两个永远是死锁
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
