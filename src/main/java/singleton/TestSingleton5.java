package singleton;

import java.io.Serializable;

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
public class TestSingleton5 implements Serializable {

    private static final long serialVersionUID = -2341790232546977277L;

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

    // 该方法会在反序列化时被调用，该方法不是接口定义的方法，有点约定俗成的感觉
    protected Object readResolve() {
        System.out.println("调用了readResolve方法!");
        return LazyHolder.INSTANCE;
    }
}
