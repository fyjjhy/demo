package reflex;

/**
 * <Description> Class类的newInstance()方法<br>
 *【注意】
 * 一般地，一个类若声明一个带参数的构造器，同时要声明一个无参数的构造器
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo4 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 1.获取Class对象
        String className = "entity.Person3";
        Class clazz = Class.forName(className);
        System.out.println(clazz);
        // 利用Class对象的newInstance方法创建一个类的实例
        Object object = clazz.newInstance(); // 调用的是类的无参数构造器
        System.out.println(object);
    }
}
