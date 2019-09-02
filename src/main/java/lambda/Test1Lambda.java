package lambda;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test1Lambda {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("My Runnable");
        }).start();
    }
}
