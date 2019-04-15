package reflex;

import entity.AgeValidator;
import entity.Person3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <Description> 如何描述注解--Annotation<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月15日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo14 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Person3 person3 = new Person3();
//        person3.setAge(10);
//        System.out.println(person3);
        String className = "entity.Person3";
        Class clazz = Class.forName(className);
        Object object = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("setAge", int.class);
        int var = 6;

        // 获取指定名称的注解
        Annotation annotation = method.getAnnotation(AgeValidator.class);
        if (annotation != null) {
            if (annotation instanceof AgeValidator) {
                AgeValidator ageValidator = (AgeValidator) annotation;
                System.out.println("最小" + ageValidator.min());
                System.out.println("最大" + ageValidator.max());
                if (var < ageValidator.min() || var > ageValidator.max()) {
                    throw new RuntimeException("年龄非法");
                }
            }
        }

        method.invoke(object, 20);
        System.out.println(object);
    }
}
