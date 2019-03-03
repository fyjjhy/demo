package singleton;

/**
 * <Description> <br>
 * static
 * static修饰成员变量
 * 用static修饰的成员变量不属于对象的数据结构，属于类的变量，通过类名来引用
 * static修饰方法
 * 不需要针对某些对象进行操作，其运行结果仅仅与输入的参数有关，调用时直接用类名引用。static方法的作用在于提供一些
 * "工具方法"和"工厂方法"等
 * static块
 * 属于类的代码块，在类加载期间执行的代码块，只执行一次，用于加载静态资源
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton1 {

    private static TestSingleton1 testSingleton1 = new TestSingleton1(); // 直接初始化一个实例对象

    private TestSingleton1() { // private类型的构造函数，保证其他类对象不能直接new一个该对象的实例
    }

    public static TestSingleton1 getSingleton1() { // 该类唯一一个public方法
        return testSingleton1;
    }


}
