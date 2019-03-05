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
public class TestStatic1 {

    private int age;

    private static int numOfCats;

    public TestStatic1(int age) {
        this.age = age;
        System.out.println(++numOfCats);
    }

    public static void main(String[] args) {
        TestStatic1 testStatic1 = new TestStatic1(28);
        TestStatic1 static1 = new TestStatic1(29);
    }
}
