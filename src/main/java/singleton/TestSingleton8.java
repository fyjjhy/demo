package singleton;
/**
 * Description: 枚举方式<br>
 *
 * @author 付永杰<br>
 * @taskId <br>
 * @return <br>
 */
public enum TestSingleton8 {
    INSTANCE;

    TestSingleton8() {
        System.out.println("构造函数执行");
    }

    public String getName() {
        return "singleEnum";
    }

    public static void main(String[] args) {
        TestSingleton8 testSingleton8 = TestSingleton8.INSTANCE;
        System.out.println(testSingleton8.getName());
    }
}
