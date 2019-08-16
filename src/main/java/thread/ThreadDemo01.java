package thread;

/**
 * <Description> 重新定义每个线程的run方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月10日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class ThreadDemo01 {

    private String threadName;

    public ThreadDemo01(String threadName) {
        this.threadName = threadName;
    }

//    public static void main(String[] args) throws InterruptedException {
//        ThreadDemo01 threadDemo01 = new ThreadDemo01("线程1");
//        ThreadDemo01 threadDemo02 = new ThreadDemo01("线程2");
//        ThreadDemo01 threadDemo03 = new ThreadDemo01("线程3");
//        threadDemo01.start();
//        threadDemo02.start();
//        threadDemo03.start();
//        threadDemo01.join(1000);
//        threadDemo02.join(1000);
//        threadDemo03.join(1000);
//        System.out.println("执行结束");
//    }

//    @Override
//    public void run() {
//        System.out.println("当前线程：" + threadName);
//    }

    public static void main(String[] args) {
        Thread thread01 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行：线程01");
            }
        });
        Thread thread02 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread01.join();
                    System.out.println("执行：线程02");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread03 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread02.join();
                    System.out.println("执行：线程03");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread01.start();
        thread02.start();
        thread03.start();
        System.out.println("执行结束!");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
