package reflex;

import DateUtil.DateUtil;
import entity.Person3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <Description> 自定义工具方法<br>
 *【自定义】
 * 1.把类对象和类方法名作为参数，执行方法
 * 2.把全类名和方法名作为参数，执行方法
 *【描述】
 * 这种反射实现的主要功能是可配置和低耦合。只需要类名和方法名，而不需要一个类对象就可以执行一个方法。
 * 如果我们把全类名和方法名放在一个配置文件中，就可以根据调用配置文件来执行方法。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo8 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // 1.把类对象和类方法名作为参数，执行方法
        Object object = new Person3();
        invoke(object, "test", "wang", 1);

        invoke("entity.Person3", "test", "zhagn", 12);

        Object result = invoke("java.text.SimpleDateFormat", "format", DateUtil.getCurrentDate());
        System.out.println(result);
    }

    /**
     * Description: 1. 把类对象和类方法名作为参数，执行方法<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param object 方法执行的那个对象.
     * @param methodName 类的一个方法的方法名. 该方法也可能是私有方法.
     * @param args 调用该方法需要传入的参数
     * @return 调用方法后的返回值 <br>
     */
    public static Object invoke(Object object, String methodName, Object ...args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 1.获取Method对象
        // 因为getMethod的参数为Class列表类型，所以要把参数args转化为对应的Class类型
        Class[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
            System.out.println(args[i]);
            System.out.println(parameterTypes[i]);
        }

        Method method = object.getClass().getDeclaredMethod(methodName, parameterTypes);
        // 如果使用getDeclaredMethod，就不能获取父类方法，如果使用getMethod，就不能获取私有方法
        return method.invoke(object, args);
    }

    public static Object invoke(String className, String methodName, Object ...args) {
        Object object = null;
        try {
            object = Class.forName(className).newInstance();
            // 调用上一个方法
            try {
                return invoke(object, methodName, args);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
