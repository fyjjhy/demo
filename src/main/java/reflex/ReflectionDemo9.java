package reflex;

/**
 * <Description> 如何获取父类定义的(私有)方法<br>
 * getDeclaredMethod():可以获取类的私有方法，不能获取父类方法
 * getMethod():可以获取父类的方法
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo9 {

    public static void main(String[] args) throws ClassNotFoundException {
        String className = "entity.Student";
        Class clazz = Class.forName(className);
        Class superClazz = clazz.getSuperclass();
        System.out.println(superClazz);
    }
}
