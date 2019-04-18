package dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月15日 <br>
 * @see entity <br>
 * @since V1.0 <br>
 */
public class DAO<T> {

    private Class<T> clazz;

    public DAO() {
        // 1.
        System.out.println("DAO's Constructor...");
        System.out.println(this);
        // this:父类构造方法中的this指的是子类对象，因为此时是PersonDAO对象在调用
        System.out.println(this.getClass());
        // 2.
        // 获取DAO子类的父类
        Class clazz = this.getClass().getSuperclass();
        System.out.println(clazz);
        // 此时只能获取父类的类型名称，却不可以获取父类的泛型参数
        // 3.
        // 获取DAO子类带泛型参数的子类
        Type type = this.getClass().getGenericSuperclass();
        System.out.println(type);
        // 此时获取了泛型参数，然后将它提取出来
        // 4.
        // 获取具体的泛型参数DAO<T>
        // 注意Type是一个空的接口，这里使用它的子类ParameterizedType，表示带参数的类类型(即泛型)
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] args = parameterizedType.getActualTypeArguments();
            System.out.println(Arrays.toString(args));
            // 得到的是一个数组，因为可能父类是多个泛型参数public class DAO<T, PK>{}
            if (args != null && args.length > 0) {
                Type arg = args[0];
                System.out.println(arg);
                // 获取第一个参数
                if (arg instanceof Class) {
                    // 把值赋给clazz字段
                    clazz = (Class<T>) arg;
                }
            }
        }
    }

    // 根据ID获取对象
    public T get(Integer id) {
        return null;
    }

    // 保存对象
    public void save(T entity) {

    }
}
