package reflex;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

import dao.PersonDAO;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/16
 * @see reflex <br>
 * @since V1.0<br>
 */
public class ReflectionDemo16 {

	public static void main(String[] args) {
		Class clazz = PersonDAO.class;
		System.out.println(clazz);
		Class argClazz = getSuperClassGenricType(clazz, 0);
		System.out.println(argClazz);
	}

	@SuppressWarnings("unchecked")
	public  Class getSuperGenericType(Class clazz){
		return getSuperClassGenricType(clazz, 0);
	}

	/**
	 * Description: 通过反射，获得定义Class时声明的父类的泛型参数的类型<br>
	 *
	 * @author 付永杰<br>
	 * @taskId <br>
	 * @param clazz 子类对应的Class对象
	 * @param index 子类继承父类时
	 * @return <br>
	 */
	@SuppressWarnings("unchecked")
	public static Class getSuperClassGenricType(Class clazz, int index) {
		Type type = clazz.getGenericSuperclass();
		System.out.println("type:" + type);
		if (!(type instanceof ParameterizedType)) {
			return null;
		}

		ParameterizedType parameterizedType = (ParameterizedType) type;
		Type[] args = parameterizedType.getActualTypeArguments();
		System.out.println("args:" + Arrays.toString(args));
		if (args == null) {
			return null;
		}

		if (index < 0 || index > args.length - 1) {
			return null;
		}

		Type arg = args[index];
		System.out.println("arg:" + arg);
		if (arg instanceof Class) {
			return (Class) arg;
		}

		System.out.println("执行");

		return null;
	}
}
