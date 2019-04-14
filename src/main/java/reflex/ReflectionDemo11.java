package reflex;

import entity.Person3;

import java.lang.reflect.Field;

/**
 * <Description> 如何描述字段-Field<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo11 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        String className = "entity.Person3";
        Class clazz = Class.forName(className);

        // 1.获取字段
        // 1.1 获取所有字段--字段数组
        // 可以获取公用和私有的所有字段，但不能获取父类字段
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("字段名称:" + field.getName());
        }

        // 1.2获取指定字段
        Field field = clazz.getDeclaredField("name");
        System.out.println(field.getName());

        Person3 person3 = new Person3("ABC", 12);

        // 2.使用字段
        // 2.1获取指定对象的指定字段值
        Object object = field.get(person3);
        System.out.println(object);

        // 2.2设置指定对象Field值
        field.set(person3, "DEF");
        System.out.println(person3.getName());

        // 2.3如果字段是私有的，不管是读值还是写值，都必须先调用setAccessible(true)方法
        field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println(field.get(person3));
    }
}
