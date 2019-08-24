package thread;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月22日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread18_Anonymous {
    public static void main(String[] args) {
        // 基于子类和接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    printInfo("interface");
                }
            }
        }) {
            @Override
            public void run() {
                while (true) {
                    printInfo("sub class");
                }
            }
        }.start();
    }

    private static void printInfo(String text) {
        System.out.println(text);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
