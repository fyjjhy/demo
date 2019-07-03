package reflex;

import entity.Person3;

/**
 * <Description> Class<br>
 *【获取Class对象的三种方式】
 * 1.通过类名获取 类名.class
 * 2.通过对象获取 对象名.getClass()
 * 3.通过全类名获取 Class.forName(全类名)
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo3 {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.通过类名
        Class clazz1 = Person3.class;
        System.out.println("1.通过类名:" + clazz1);
        // 2.通过对象名
        // 这种方式需要传进来一个对象，却不知道对象类型的时候使用
        Person3 person3 = new Person3();
        Class clazz2 = person3.getClass();
        System.out.println("2.通过对象名:" + clazz2.getName());
        System.out.println(clazz1 == clazz2);
        // 上面这个列子意义不大，因为已经知道person类型是Person类，再这样写就没有必要的
        // 如果传进来的是一个Object类，这种做法就是应该的
        Object object = new Person3();
        Class clazz3 = object.getClass();
        System.out.println("2.通过对象名:" + clazz3);
        System.out.println(clazz1 == clazz3);
        // 3.通过全类名(会抛出异常)
        // 一般框架开发中这种用的比较多，因为配置文件中一般配的都是全类名，通过这种方式可以得到Class实例
        String className = "entity.Person3";
        Class clazz4 = Class.forName(className);
        System.out.println("3.通过全类名:" + clazz4);
    }
}
