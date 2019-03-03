package singleton;

/**
 * <Description> 使用双重同步锁<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton3 {

    private static TestSingleton3 testSingleton3;

    private TestSingleton3() {
    }

    public static TestSingleton3 getInstance() {
        if (testSingleton3 == null) {
            synchronized (TestSingleton3.class) { // 对获取实例的方法进行同步
                if (testSingleton3 == null) {
                    testSingleton3 = new TestSingleton3();
                }
            }
        }
        return testSingleton3;
    }
}
