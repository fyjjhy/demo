package reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

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
public class ReflectionGenericityDemo1 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");

        Class clazz = list.getClass();
        // 获取add()
        Method method = clazz.getMethod("add", Object.class);
        // 调用add()
        method.invoke(list, 100);

        // 遍历
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
