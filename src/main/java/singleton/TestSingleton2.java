package singleton;

/**
 * <Description> 使用同步锁<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton2 {

    private static TestSingleton2 testSingleton2;

    private TestSingleton2() {
    }

    public static synchronized TestSingleton2 getInstance() { // 对获取实例的方法进行同步
        if (testSingleton2 == null) {
            testSingleton2 = new TestSingleton2();
        }
        return testSingleton2;
    }
}
