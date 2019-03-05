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
public enum  TestSingleton11 {

    singletonFactory;

    private MySingleton singleton;

    TestSingleton11() {
        singleton = new MySingleton();
    }

    public MySingleton getInstance() {
        return singleton;
    }
}

