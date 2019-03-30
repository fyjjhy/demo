package basics;

/**
 * <Description> toString()<br>
 * Object类提供的toString()方法总是返回该对象实现类的"类名+@+hashCode"值，
 * 这个值不能真正实现"自我描述"功能，用户需要重写Object类的toString()方法
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/30
 * @see basics <br>
 * @since V1.0<br>
 */
public class Basic2 {

	private String color;

	private double weight;

	public Basic2(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

//	@Override
//	public String toString() {
//		return "Basic2{" +
//				"color='" + color + '\'' +
//				", weight=" + weight +
//				'}';
//	}

	public static void main(String[] args) {
		Basic2 basic2 = new Basic2("红色", 5.68);
		System.out.println(basic2);
	}
}
