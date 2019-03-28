package lock;

/**
 * <Description> 死锁<br>
 * 链接：https://www.cnblogs.com/JianGuoWan/p/9139698.html
 * 描述：
 * 1.Thread.sleep(0)并非是真的要线程挂起0毫秒，意义在于这次调用Thread.sleep(0)的当前线程
 * 确实的被冻结一下，让其他线程有机会优先执行。
 * 2.Thread.sleep(0)是你的线程暂时放弃CPU，也就是释放一些未用的时间片给其他线程或进程使用，
 * 就相当于一个让位动作。
 * 3.在线程没有退出之前，线程有三个状态，就绪态，等待态，运行态。
 * sleep(n)之所以在n毫秒内不参与CPU竞争，是因为，当线程调用sleep(n)的时候，
 * 线程由运行态转入等待态，线程被放入等待队列中，等待定时器n毫秒后的中断事件，
 * 当达到n毫秒计时后，线程才重新由等待态转入就绪态，被放入就绪队列中，
 * 等待队列中的线程是不参与CPU竞争的，只有就绪队列中的线程才会参与CPU竞争，
 * 所谓的CPU调度，就是根据一定的算法(优先级，FIFIO等。。。)，从就绪队列中选择一个线程来分配CPU时间片，
 * 而sleep(0)之所以马上回去参与CPU竞争，是因为调用sleep(0)后，因为0的原因，
 * 线程直接回到就绪状态，而非进入等待队列，只要进入就绪队列，那么它就参与CPU竞争。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月10日 <br>
 * @see lock <br>
 * @since V1.0 <br>
 */
public class TestDeadLock {

    private static String obj1 = "obj1";

    private static String obj2 = "obj2";

    public static void main(String[] args) {
        TestDeadLock testDeadLock = new TestDeadLock();
        Thread a = new Thread(testDeadLock.new Lock1());
        Thread b = new Thread(testDeadLock.new Lock2());
        a.start();
        b.start();
    }

    class Lock1 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Lock1 running");
                while (true) {
                    synchronized (TestDeadLock.obj1) {
                        System.out.println("Lock1 lock obj1");
                        Thread.sleep(3000); // 获取obj1后先等一会儿，让Lock2有足够的时间锁住obj2
                        // 在未来的多少毫秒内我不参与CPU竞争
                        synchronized (TestDeadLock.obj2) {
                            System.out.println("Lock1 lock obj2");
                        }
                    }
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
                System.out.println("Lock2 running");
                while (true) {
                    synchronized (TestDeadLock.obj2) {
                        System.out.println("Lock2 lock obj2");
                        Thread.sleep(3000);
                        synchronized (TestDeadLock.obj1) {
                            System.out.println("Lock2 lock obj1");
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
