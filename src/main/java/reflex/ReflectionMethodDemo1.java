package reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月02日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionMethodDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 1.获取Class对象
        Class clazz = Class.forName("entity.Student");

        // 2.获取所有的公共方法
        System.out.println("获取所有的共有方法：*******************************");
        Method[] methods = clazz.getMethods();
        System.out.println(Arrays.toString(methods));

        System.out.println("获取所有的方法，包括私有的**************************");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        System.out.println("获取共有的show1()**********************************");
        Method method = clazz.getMethod("show1", String.class);
        System.out.println(method);

        // 实例化一个Student对象
        Object object = clazz.getConstructor().newInstance();
        method.invoke(object, "fuyonjige");

        System.out.println("获取私有的show4()***********************************");
        method = clazz.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        method.setAccessible(true);
        Object result = method.invoke(object, 20);
        System.out.println("返回值：" + result);

        System.out.println("获取main()******************************************");
        // 2.获取main方法
        Method mainMethod = clazz.getMethod("main", String[].class);

        mainMethod.invoke(null, (Object) new String[]{"a", "b", "c"});
        mainMethod.invoke(null, new Object[]{new String[]{"a", "b", "c"}});
    }
}
