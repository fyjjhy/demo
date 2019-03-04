package singleton;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月04日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton6 {
    private static final TestSingleton6 singleton = new TestSingleton6();

    private TestSingleton6() {
    }

    public static TestSingleton6 getInstance() {
        return singleton;
    }
}
