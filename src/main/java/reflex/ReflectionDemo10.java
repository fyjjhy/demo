package reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <Description> 定义一个方法，不但能访问当前类的私有方法，还要能访问父类的私有方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo10 {

    public static void main(String[] args) {

    }

    public Object invoke(Object object, String methodName, Object ...args) {
        // 1.获取Method对象
        Class[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }

        Method method = getMethod(object.getClass(), methodName, parameterTypes);
        method.setAccessible(true);
        // 2.执行method方法
        try {
            return method.invoke(object, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Method getMethod(Class clazz, String methodName, Class ...parameterTypes) {
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            try {
                Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
                return method;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
