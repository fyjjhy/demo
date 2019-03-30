package basics;

/**
 * <Description> == 和 equals方法<br>
 * ==:
 * 判断基本数据类型时，当且仅当变量的数据类型和变量的值都一致时才返回true。
 * 判断引用类型变量时，只有当它们指向同一个对象时才返回true。
 * 不可用于比较类型上没有父子关系的两个对象。
 * equals:
 * 判断两个字符串变量的引用字符串的字符序列是否相等，相等就返回true。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/30
 * @see basics <br>
 * @since V1.0<br>
 */
public class Basic3 {

	public static void main(String[] args) {

		// 直接引用常量池
		String s1 = "疯狂java";
		String s2 = "疯狂";
		String s3 = "java";
		String s4 = "疯狂" + "java"; // 字符串值在编译的时候确定下来，直接引用常量池中的"疯狂java"
		String s5 = s2 + s3; // 字符串值在编译的时候确定下来，不能直接引用常量池中的"疯狂java"
		// JVM会使用常量池来管理"疯狂java"，在调用构造器创建一个新的String对象，一共产生了两个字符串对象
		String s6 = new String("疯狂java"); // 调用构造器创建一个新的String对象，引用堆内存中的String对象
		System.out.println(s1 == s4); // true
		System.out.println(s1 == s5); // false
		System.out.println(s1 == s6); // false
		System.out.println(s4 == s6); // false

	}
}
