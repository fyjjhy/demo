package singleton;

/**
 * <Description> 懒汉式单例:在第一次调用的时候实例化自己<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton4 {
    private static TestSingleton4 testSingleton4;

    private TestSingleton4() {
    }

    // 静态工厂方法
    public static TestSingleton4 getInstance() {
        if (testSingleton4 == null) {
            testSingleton4 = new TestSingleton4();
        }
        return testSingleton4;
    }
}
