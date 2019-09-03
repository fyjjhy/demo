package design_patterns;

/**
 * <Description> 饿汉式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class Test_Singleton {
    // 直接创建对象
    public static Test_Singleton instance = new Test_Singleton();

    // 私有化构造函数
    private Test_Singleton() {

    }

    // 返回对象实例
    public static Test_Singleton getInstance() {
        return instance;
    }
}
