package singleton;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月05日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton9 {

    static {
        System.out.println("static 代码块执行中");
    }

    {
        System.out.println("构造代码块执行中");
    }

    public TestSingleton9() {
        System.out.println("构造函数执行中");
    }

    public static void main(String[] args) {
        System.out.println("main函数执行中");
        TestSingleton9 testSingleton9 = new TestSingleton9();
    }
}
