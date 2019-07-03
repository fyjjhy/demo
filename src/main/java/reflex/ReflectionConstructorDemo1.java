package reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import entity.Student;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/7/2
 * @see reflex <br>
 * @since V1.0<br>
 */
public class ReflectionConstructorDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// 1.加载Class对象
		Class clazz = Class.forName("entity.Student");

		// 2.获取所有公有构造方法
		System.out.println("调用所有公有构造方法*****************************");
		Constructor[] constructors = clazz.getConstructors();
		System.out.println(Arrays.toString(constructors));

		// 获取所有的构造方法
		System.out.println("调用所有的构造方法(包括:私有、受保护、默认、公有)************");
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		System.out.println(Arrays.toString(declaredConstructors));

		// 获取公有、无参的构造方法
		System.out.println("获取公有、无参的构造方法*********************************");
		Constructor constructor = clazz.getConstructor(String.class);
		System.out.println(constructor);
		// 调用构造方法
		Object obj = constructor.newInstance("fuyonjige");
		System.out.println(obj);

		// 获取私有构造方法，并调用
		System.out.println("获取私有构造方法，并调用***********************************");
		Constructor con = clazz.getDeclaredConstructor(int.class);
		System.out.println(con);
		con.setAccessible(true);
		// 调用构造方法
		Object object = con.newInstance(1);
		System.out.println(object);
	}
}
