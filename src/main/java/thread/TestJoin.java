package thread;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestJoin {

    public static void main(String[] args) {
        Thread t1 = new Thread("A") {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ":正在下载图片:" + i*10 + "%");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "图片下载完成");
            }
        };

        Thread t2 = new Thread("B") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":等待图片下载完毕");
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "显示图片");
            }
        };

        t1.start();
        t2.start();
    }
}
