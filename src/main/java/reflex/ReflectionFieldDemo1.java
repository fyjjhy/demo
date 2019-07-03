package reflex;

import java.lang.reflect.Field;
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
public class ReflectionFieldDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// 1.获取Class对象
		Class clazz = Class.forName("entity.Student");
		// 2.获取字段
		System.out.println("获取公有字段*********************************");
		Field[] fields = clazz.getFields();
		System.out.println(Arrays.toString(fields));

		System.out.println("获取所有字段(包括:私有、受保护、默认的)*************");
		Field[] declaredFields = clazz.getDeclaredFields();
		System.out.println(Arrays.toString(declaredFields));

		System.out.println("获取公有字段并调用****************************");
		Field nameField = clazz.getField("name");
		System.out.println(nameField);

		// 获取一个对象
		Object object = clazz.getConstructor().newInstance();
		// 为字段设值
		nameField.set(object, "fuyongjie");
		// 验证
		Student student = (Student) object;
		System.out.println(student.getName());

		System.out.println("获取私有字段，并调用**********************");
		Field scoreField = clazz.getDeclaredField("score");
		System.out.println(scoreField);
		scoreField.setAccessible(true);
		scoreField.set(object, 90);
		System.out.println(student.getScore());
	}
}
