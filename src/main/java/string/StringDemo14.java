package string;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月20日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo14 {
    public static void main(String[] args) {
        String str = "haha";
        new Thread(){
            @Override
            public void run() {
                System.out.println(str);
            }
        }.start();
        // str = "he";
    }
}
