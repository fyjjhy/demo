package reflex;

import entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <Description> 如何描述构造器-Constructor<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月15日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo13 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 定义一个全类名
        String className = "entity.Person3";
        Class<Person> clazz = (Class<Person>) Class.forName(className);
        // 1.获取Constructor对象
        // 1.1获取全部
        Constructor<Person> [] constructors = (Constructor<Person>[]) clazz.getConstructors();
        for (Constructor<Person> constructor : constructors) {
            System.out.println(constructor);
        }
        // 1.2获取某一个，需要参数列表
        Constructor<Person> constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);

        // 2.调用构造器newInstance()方法创建对象
        Object object = constructor.newInstance("zhagn", 1);
        System.out.println(object);
    }
}
