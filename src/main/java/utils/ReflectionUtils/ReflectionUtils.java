package utils.ReflectionUtils;

import java.lang.reflect.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月16日 <br>
 * @see utils.ReflectionUtils <br>
 * @since V1.0 <br>
 */
public class ReflectionUtils {

    /**
     * Description: 通过反射，获得定义Class时声明的父类的泛型参数的类型<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param clazz
     * @param index
     * @return <br>
     */
    @SuppressWarnings("unchecked")
    public static Class getSuperClassGenericType(Class clazz, int index) {
        Type type = clazz.getGenericSuperclass();
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }

        Type[] args = ((ParameterizedType) type).getActualTypeArguments();
        if (index> args.length || index < 0) {
            return Object.class;
        }

        if (!(args[index] instanceof Class)) {
            return Object.class;
        }

        return (Class) args[index];
    }

    /**
     * Description: 通过反射，获得Class定义中声明的父类的泛型参数类型<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param clazz
     * @return <br>
     */
    @SuppressWarnings("unchecked")
    public static <T> Class<T> getSuperGenericType(Class clazz) {
        return getSuperClassGenericType(clazz, 0);
    }

    /**
     * Description: 循环向上转型，获取对象的DeclaredMethod<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param object
     * @param methodName
     * @param parameterTypes
     * @return <br>
     */
    public static Method getDeclaredMethod(Object object, String methodName, Class<?>[] parameterTypes) {
        for (Class<?> superClass = object.getClass(); superClass != object.getClass(); superClass = superClass.getSuperclass()) {
            try {
                superClass.getDeclaredMethod(methodName, parameterTypes);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Description: 使field变为可访问<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param field
     * @return <br>
     */
    public static void makeAccessible(Field field) {
        if (Modifier.isPublic(field.getModifiers())) {
            field.setAccessible(true);
        }
    }

    /**
     * Description: 循环向上转型，获取对象的DeclaredField<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param object
     * @param fieldName
     * @return <br>
     */
    public static Field getDeclaredField(Object object, String fieldName) {
        for (Class<?> superClass = object.getClass(); superClass != Object.class; superClass = superClass.getSuperclass()) {
            try {
                return superClass.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Description: 直接调用对象方法，而忽略修饰符(private, protected)<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param object
     * @param methodName
     * @param parameterTypes
     * @param parameters
     * @return <br>
     */
    public static Object invokeMethod(Object object, String methodName, Class<?> [] parameterTypes, Object[] parameters) {
        Method method = getDeclaredMethod(object, methodName, parameterTypes);
        if (method == null) {
            throw new IllegalArgumentException("Could not find method [" + methodName + "] on target [" + object + "]");
        }

        method.setAccessible(true);

        try {
            return method.invoke(object, parameters);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Description: 直接设置对象的属性值，忽略private/protected修饰符，也不经过setter<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param object
     * @param fieldName
     * @param value
     * @return <br>
     */
    public static void setFieldValue(Object object, String fieldName, Object value) {
        Field field = getDeclaredField(object, fieldName);

        if (field == null) {
            throw new IllegalArgumentException("Could not find method [" + fieldName + "] on target [" + object + "]");
        }

        makeAccessible(field);

        try {
            field.set(object, value);
        } catch (IllegalAccessException e) {
            System.out.println("不可能抛出的异常");
        }
    }

    /**
     * Description: 直接读取对象的属性值，忽略private/protected修饰符，也不经过setter<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param object
     * @param fieldName
     * @return <br>
     */
    public static Object getFieldValue(Object object, String fieldName) {
        Field field = getDeclaredField(object, fieldName);

        if (field == null) {
            throw new IllegalArgumentException("Could not find method [" + fieldName + "] on target [" + object + "]");
        }

        makeAccessible(field);

        Object result = null;

        try {
            result = field.get(object);
        } catch (IllegalAccessException e) {
            System.out.println("不可能抛出的异常");
        }
        
        return result;
    }
}
