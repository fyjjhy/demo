package thread;

import java.util.concurrent.Semaphore;

/**
 * <Description> 信号量，Semaphore可以控制同时访问的线程个数<br>
 * 通过acquire()获取一个许可，如果没有就等待，而release()释放一个许可
 * acquire()用来获取一个许可，若无许可能够获得，则会一直等待，直到获得许可。
 * release()用来释放许可。注意，在释放许可之前，必须先获得许可。
 * 总结：
 * 1.CountDownLatch和CyclicBarrier都能够实现线程之间的等待，只不过侧重点不同：
 * CountDownLatch一般用于某个线程A等待若干个其他线程执行完任务之后，它才执行；
 * 而CyclicBarrier一般用于一组线程互相等待至某个状态，然后这一组线程再同时执行；
 * CountDownLatch是不能够重用的，而CyclicBarrier是可以重用的。
 * 2.Semaphore其实和锁有点类似，它一般用于控制对某组资源的访问控制。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月29日 <br>
 * @see thread <br>
 * @since https://www.cnblogs.com/dolphin0520/p/3920397.html <br>
 */
public class Semaphore1 {

    public static void main(String[] args) {
        int N = 8;
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < N; i++) {
            new Worker(i, semaphore).start();
        }
    }

    static class Worker extends Thread {
        private int num;
        private Semaphore semaphore;
        public Worker(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人"+this.num+"占用一个机器在生产...");
                Thread.sleep(2000);
                System.out.println("工人"+this.num+"释放出机器");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
