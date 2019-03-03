package singleton;

/**
 * <Description> 静态内部类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton5 {

    private static class LazyHolder { // 静态内部类
        private static final TestSingleton5 INSTANCE = new TestSingleton5();
    }

    private TestSingleton5() {

    }

    public static final TestSingleton5 getInstance() {
        return LazyHolder.INSTANCE;
    }

    public static void main(String[] args) {
        TestSingleton5 testSingleton5 = TestSingleton5.getInstance();
        System.out.println(testSingleton5);
    }
}
