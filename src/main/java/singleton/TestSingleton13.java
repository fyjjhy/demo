package singleton;

/**
 * <Description> 单例类<br>
 * 【特殊场景】
 * 不允许自由创建该类的对象，而只允许为该类创建一个对象。
 * 【限制】
 * 把类的构造器使用private修饰。
 * 【封装原则】
 * 一旦把类的构造器隐藏起来，则需要提供一个public方法作为该类的访问点，用于创建该类的对象，且方法必须使用static修饰(
 * 因为调用该方法之前还不存在对象，因此调用该方法的不可能是对象，只能是类)
 * 除此之外，该类还必须缓存已经创建的对象，否则该类无法知道是否曾经创建过对象。
 * 为此该类需要使用一个成员变量来保存曾经创建的对象，因为该成员变量需要上面的静态方法访问，
 * 故该成员变量必须使用static修饰。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月01日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton13 {

    private static TestSingleton13 singleton13;

    private TestSingleton13() {
    }

    public static TestSingleton13 getInstance() {
        if (singleton13 == null) {
            singleton13 = new TestSingleton13();
        }
        return singleton13;
    }

    public static void main(String[] args) {
        TestSingleton13 testSingleton131 = TestSingleton13.getInstance();
        TestSingleton13 testSingleton132 = TestSingleton13.getInstance();
        System.out.println(testSingleton131 == testSingleton132);
    }
}
