package java_static;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see java_static <br>
 * @since V1.0 <br>
 */
public class TestStatic2 {

    static {
        System.out.println("在类加载期间执行，只执行一次");
    }

    public TestStatic2() {
        System.out.println("执行构造器");
    }

    public static void main(String[] args) {
        TestStatic2 testStatic2 = new TestStatic2();
    }
}
