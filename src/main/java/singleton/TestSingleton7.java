package singleton;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> 单例模式为面向对象的应用程序提供对象唯一的访问点，整个应用程序都会同享一个实例对象<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月04日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class TestSingleton7 {

    private String name;

    private static volatile TestSingleton7 testSingleton7;

    private TestSingleton7() {
    }

    public static TestSingleton7 getInstance() {
        if (testSingleton7 == null) {
            synchronized (TestSingleton7.class) {
                if (testSingleton7 == null) {
                    testSingleton7 = new TestSingleton7();
                }
            }
        }
        return testSingleton7;
    }

    public void printInfo() {
        System.out.println("the name is" + name);
    }

    public static void main(String[] args) {
        TestSingleton7 testSingleton7 = TestSingleton7.getInstance();
        testSingleton7.setName("道家老子");
        TestSingleton7 singleton7 = TestSingleton7.getInstance();
        singleton7.setName("儒家孔子");
        testSingleton7.printInfo();
        singleton7.printInfo();
        if (testSingleton7 == singleton7) {
            System.out.println("创建的是同一个实例!");
        }
        else {
            System.out.println("创建的不是同一个实例!");
        }
    }
}
