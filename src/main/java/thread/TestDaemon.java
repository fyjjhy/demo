package thread;

/**
 * <Description> 测试守护线程<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestDaemon {

    public static void main(String[] args) {
        Thread d = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("后台线程");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        d.setDaemon(true);
        d.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main线程结束了");
    }
}
