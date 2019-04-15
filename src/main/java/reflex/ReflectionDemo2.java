package reflex;

import entity.Person3;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * <Description> 通过Class类获取类对象<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo2 {

    public static void main(String[] args) {
        Class clazz = null;
        // 1.得到Class对象
        clazz = Person3.class;
        System.out.println(clazz);
        // 2.返回字段的数组
        Field[] fields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
    }
}
