package reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * <Description> 反射<br>
 *【概述】
 * 反射是Java被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API 取得任何类的内部信息，并能
 * 直接操作任意对象的内部属性及方法。
 *【功能】
 * 1.在运行时构造任意一个类的对象
 * 2.在运行时获取任意一个类所具有的成员变量和方法
 * 3.在运行时调用任意一个对象的方法(属性)
 * 4.生成动态代理
 * Class是一个类；一个描述类的类。
 * 封装了描述方法的Method
 *      描述字段的Filed
 *      描述构造器的Constructor等属性
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo7 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 3.1如何描述方法-Method
        Class clazz = Class.forName("entity.Person3");
        System.out.println(clazz);
        // 1.获取方法
        // 获取clazz对应类中的所有方法--方法数组
        // 不能获取private方法，且获取从父类继承来的所有方法
        Method[] methods = clazz.getMethods();
        System.out.println(Arrays.toString(methods));

        // 1.2获取所有方法，包括私有方法--方法数组
        // 所有声明的方法，都可以获取到，且只获取当前类的方法
        methods = clazz.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        // 1.3获取指定方法
        // 需要参数名称和参数列表，无参则不需要写
        Method method = clazz.getDeclaredMethod("setName", String.class);
        System.out.println(method);
        method = clazz.getDeclaredMethod("setAge", int.class);
        System.out.println(method);

        // 2.执行方法
        // invoke第一个参数表示执行哪个对象的方法，剩下的参数是执行方法时需要传入的参数
        Object object = clazz.newInstance();
        method.invoke(object, 2);
        // 如果一个方法是私有方法，第三步是可以获取到的，但是这一步却不能执行
        // 私有方法的执行，必须在调用invoke之前加上一句method.setAccessible(true);
        System.out.println(object);
    }
}
