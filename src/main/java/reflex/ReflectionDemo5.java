package reflex;

/**
 * <Description> ClassLoader<br>
 *【描述】
 * 类装载器是用来把类装载进JVM的。
 *【类装载器】
 * JVM规范定义了两种类型的类装载器：
 * 1.启动类装载器(bootstrap)
 * 2.用户自定义装载器
 *【初始化加载器层次结构】
 * 1.检查类是否已经加载 System(系统类加载器)->Extension(扩展类加载器)->Bootstap Classloader(引导类加载器)
 * 2.尝试加载类 Bootstap->Extension->System Classloader
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo5 {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.获取一个系统的类加载器(可以获取，当前这个类ReflectionDemo5就是它加载的)
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        // 2.获取系统类加载器的父类加载器(扩展类加载器，可以获取)
        classLoader = classLoader.getParent();
        System.out.println(classLoader);

        // 3.获取扩展类加载器的父类加载器(引导类加载器，不可获取)
        classLoader = classLoader.getParent();
        System.out.println(classLoader);

        // 4.测试当前类由哪个类加载器负责加载(系统类加载器)
        classLoader = Class.forName("reflex.ReflectionDemo5").getClassLoader();
        System.out.println(classLoader);

        // 5.测试JDK提供的Object类由哪个类加载期负责加载(引导类)
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);
    }
}
