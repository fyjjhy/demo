package basics;

/**
 * <Description> 包装类<br>
 * 8中基本数据类型不支持面向对象的编程机制，也不具备对象的特性：
 * 没有成员变量，方法可以调用。
 * 【自动装箱、自动拆箱】
 * 自动装箱：把一个基本类型变量赋给对应的包装类变量。
 * 两种方式吧字符串类型的值转换成基本类型的值
 * 1.包装类提供的parseXXX(String s)静态方法
 * 2.包装类提供的XXX(String s)构造器
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/30
 * @see basics <br>
 * @since V1.0<br>
 */
public class Basic1 {

	public static void main(String[] args) {

		// 两个128
		Integer integer1 = new Integer(128);

		Integer integer2 = new Integer(128);

		System.out.println(integer1 == integer2);

		System.out.println(Integer.compare(128, 128));

	}
}
