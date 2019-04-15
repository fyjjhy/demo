package reflex;

import java.lang.reflect.Field;

/**
 * <Description> 访问父类中的私有字段<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月15日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo12 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        // 1.定义全类名
        String className = "entity.Student";
        // 2.定义属性名
        String fieldName = "age";
        Object var = 20;
        Object object = null;
        // 创建className对应的类对象
        Class clazz = Class.forName(className);
        // 创建fieldName对象字段的对象
        Field field = getField(clazz, fieldName);
        // 为此对象赋值
        object = clazz.newInstance();
        setFieldValue(object, field, var);
        // 获取此对象的值
        Object value = getFieldValue(object, field);
        System.out.println("获取此对象的值:" + value);
    }

    public static Object getFieldValue(Object object, Field field) throws IllegalAccessException {
        field.setAccessible(true);
        return field.get(object);
    }

    public static void setFieldValue(Object object, Field field, Object var) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(object, var);
    }

    public static Field getField(Class clazz, String fieldName) throws NoSuchFieldException {
        Field field = null;
        for (Class clazz2 = clazz; clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
            field = clazz2.getDeclaredField(fieldName);
        }
        return field;
    }

}
