package design_patterns;

/**
 * <Description> 懒汉式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class Test1_Singleton {
    // 声明变量
    private static volatile Test1_Singleton singleton = null;

    // 私有化构造函数
    private Test1_Singleton() {

    }

    // 提供对外方法
    public static Test1_Singleton getInstance() {
        if (singleton == null) {
            synchronized (Test1_Singleton.class) {
                if (singleton == null) {
                    singleton = new Test1_Singleton();
                }
            }
        }
        return singleton;
    }
}
