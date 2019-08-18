package finalClass;

import java.lang.reflect.Field;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月18日 <br>
 * @see finalClass <br>
 * @since V1.0 <br>
 */
public class FinalDemo03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "Hello World";
        System.out.println("s=" + s);
        // 获取String类中的value字段
        Field valueFieldOfString = String.class.getDeclaredField("value");
        // 改变value属性的访问权限
        valueFieldOfString.setAccessible(true);
        // 获取s对象上的value属性的值
        char[] value = (char[]) valueFieldOfString.get(s);
        value[5] = '_';
        System.out.println("s=" + s);
    }
}
