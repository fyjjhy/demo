package thread;

/**
 * <Description> 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月18日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class ThreadDemo1 {

    private int j;

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        Inc inc = threadDemo1.new Inc();
        Dec dec = threadDemo1.new Dec();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(inc);
            thread.start();
            thread = new Thread(dec);
            thread.start();
        }
    }

    private synchronized void inc() {
        j++;
        System.out.println(Thread.currentThread().getName() + "-inc:" + j);
    }

    private synchronized void dec() {
        j--;
        System.out.println(Thread.currentThread().getName() + "dec:" + j);
    }

    class Inc implements Runnable {

        @Override
        public void run() {
            inc();
        }
    }

    class Dec implements Runnable {

        @Override
        public void run() {
            dec();
        }
    }

}
