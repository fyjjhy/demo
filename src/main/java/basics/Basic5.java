package basics;

/**
 * <Description> 类成员<br>
 * static关键字修饰的成员就是类成员。类成员有4种，包括：
 * 1.类变量
 * 	类变量属于整个类，当系统第一次准备使用该类时，系统会为该类变量分配内存空间，
 *  类变量开始生效，直到该类被卸载，该类的类变量所占有的内存空间才会被系统的垃圾回收机制回收。
 *  当类初始化完成后，类变量也初始化完成。
 * 【访问】
 * 类变量可以通过类来访问，也可以通过类的对象来访问。
 * 当通对象来访问类变量时，系统会在底层转换为通过该类访问变量。
 * 【注意】
 * 类成员不能访问实例成员。
 * 因为类变量属于类，作用域比实例成员的作用域大。
 * 完全可能出现类成员初始化完成，但实例成员还不曾初始化的情况。
 * 2.类方法
 * 3.静态初始化块
 * 4.内部类等
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/30
 * @see basics <br>
 * @since V1.0<br>
 */
public class Basic5 {

	public static void main(String[] args) {

	}
}