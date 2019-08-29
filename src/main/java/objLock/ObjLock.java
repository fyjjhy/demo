package objLock;

/**
 * <Description> 当一个线程进入一个对象的一个synchronized()后，其它线程是否可进入此对象的其它方法<br>
 * 情景1：其他线程进入此对象的非同步方法
 * 运行结果：一个线程在访问一个对象的同步方法时，另一个线程可以同时访问这个对象的非同步方法。
 * 情景2：其他线程进入此对象的该同步方法
 * 运行结果：一个线程在访问一个对象的同步方法时，另一个线程不能同时访问这个同步方法。
 * 情景3：其他线程进入此对象的另一个同步方法
 * 运行结果：一个线程在访问一个对象的同步方法时，另一个线程不能同时访问这个对象的另一个同步方法。
 * 情景4：其他线程进入此对象的另一个静态同步方法
 * 运行结果：一个线程在访问一个对象的同步方法时，另一个线程能同时访问一个对象的另一个静态同步方法。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月28日 <br>
 * @see objLock <br>
 * @since V1.0 <br>
 */
public class ObjLock {

    public synchronized void syncMethod() {
        System.out.println(Thread.currentThread().getName() + " 执行sync().");
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " 继续执行sync().");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void generalMethod() {
        System.out.println(Thread.currentThread().getName() + " 执行普通()。");
    }

    public synchronized void otherSyncMethod() {
        System.out.println(Thread.currentThread().getName() + " 执行其他sync().");
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " 继续执行其他sync().");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void staticMethod() {
        System.out.println(Thread.currentThread().getName() + " 执行静态方法");
    }

    /**
     * Description: 情景1<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param args
     * @return <br>
     */
//    public static void main(String[] args) {
//        ObjLock objLock = new ObjLock();
//        ThreadDemo1 threadDemo1 = new ThreadDemo1(objLock);
//        ThreadDemo2 threadDemo2 = new ThreadDemo2(objLock);
//
//        Thread t1 = new Thread(threadDemo1);
//        Thread t2 = new Thread(threadDemo2);
//        t1.start();
//        t2.start();
//    }

    /**
     * Description: 情景2<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param args
     * @return <br>
     */
//    public static void main(String[] args) {
//        ObjLock objLock = new ObjLock();
//        ThreadDemo1 threadDemo1 = new ThreadDemo1(objLock);
//        ThreadDemo3 threadDemo3 = new ThreadDemo3(objLock);
//
//        Thread t1 = new Thread(threadDemo1);
//        Thread t3 = new Thread(threadDemo3);
//        t1.start();
//        t3.start();
//    }

    /**
     * Description: 情景3<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param args
     * @return <br>
     */
//    public static void main(String[] args) {
//        ObjLock objLock = new ObjLock();
//        ThreadDemo1 threadDemo1 = new ThreadDemo1(objLock);
//        ThreadDemo4 threadDemo4 = new ThreadDemo4(objLock);
//
//        Thread t1 = new Thread(threadDemo1);
//        Thread t4 = new Thread(threadDemo4);
//        t1.start();
//        t4.start();
//    }

    /**
     * Description: 静态的同步方法，非静态的同步方法<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param args
     * @return <br>
     */
    public static void main(String[] args) {
        ObjLock objLock = new ObjLock();
        ThreadDemo1 threadDemo1 = new ThreadDemo1(objLock);

        Thread t1 = new Thread(threadDemo1);
        Thread t5 = new Thread(() -> {
            ObjLock.staticMethod();
        });
        t1.start();
        t5.start();
    }
}
