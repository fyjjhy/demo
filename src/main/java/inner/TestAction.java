package inner;

/**
 * <Description> 匿名内部类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see inner <br>
 * @since V1.0 <br>
 */
public class TestAction {

    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void execute() {
                System.out.println("Hello,world");
            }
        };
        action.execute();
    }
}
