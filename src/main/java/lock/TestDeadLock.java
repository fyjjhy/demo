package lock;

/**
 * <Description> 死锁<br>
 *
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
//        Thread b = new Thread(testDeadLock.new Lock2());
        a.start();
//        b.start();
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
