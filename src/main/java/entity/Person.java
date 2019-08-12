package entity;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> java方法区、栈和堆<br>
 * 【链接地址】
 * https://blog.csdn.net/u013241673/article/details/78574770
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/28
 * @see entity <br>
 * @since V1.0<br>
 */
@Getter
@Setter
public class Person extends AbstractVo {

	private static final long serialVersionUID = 4065060120377682419L;

	// 实例变量name,age在堆中分配空间
	private String name;

	private Integer age;

	// 类变量(引用类型)name1,"cn"都在方法区
	private static String name1 = "cn";

	// 类变量(引用类型)name2在方法区
	// new String("cn")对象在堆中分配空间
	private  static String name2 = new String("cn");

	// num在堆中，new int[10]也在堆中
	private int[] sum = new int[10];

	private static String country;

	public Person(String name, Integer age) {
		// this及形参name,age在构造方法被调用时会在构造方法的栈帧中开辟空间
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	// setName()方法在方法区中
	public void setName(String name) {
		this.name = name;
	}

	// speak()方法在方法区中
	public void speak() {
		System.out.println(this.name+"..."+this.age);
	}

	public static void showCountry() {
		System.out.println("country=" + country);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static String getName1() {
		return name1;
	}

	public static void setName1(String name1) {
		Person.name1 = name1;
	}

	public static String getName2() {
		return name2;
	}

	public static void setName2(String name2) {
		Person.name2 = name2;
	}

	public int[] getSum() {
		return sum;
	}

	public void setSum(int[] sum) {
		this.sum = sum;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Person.country = country;
	}
}
