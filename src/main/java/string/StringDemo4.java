package string;

/**
 * <Description> 将一个基本数据类型转为字符串<br>
 *【方式】
 * 1.基本数据类型.toString() -- 快
 * 2.String.valueOf(数据) -- 次之
 * 3.数据+"" --慢
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/12
 * @see string <br>
 * @since V1.0<br>
 */
public class StringDemo4 {

	private static final int SUM = 100000;

	public static void main(String[] args) {
		long startTime1 = System.currentTimeMillis();
		System.out.println("测试方式1：基本数据类型.toString() 开始执行!");
		for (int i = 0; i < SUM; i++) {
			String str = Integer.toString(i);
		}
		System.out.println("测试方式1：基本数据类型.toString() 结束执行!" + (System.currentTimeMillis() - startTime1));

		long startTime2 = System.currentTimeMillis();
		System.out.println("测试方式2：String.valueOf(数据) 开始执行!");
		for (int i = 0; i < SUM; i++) {
			String str = String.valueOf(i);
		}
		System.out.println("测试方式2：String.valueOf(数据) 结束执行!" + (System.currentTimeMillis() - startTime2));

		long startTime3 = System.currentTimeMillis();
		System.out.println("测试方式3：数据+'' 开始执行!");
		for (int i = 0; i < SUM; i++) {
			String str = i + "";
		}
		System.out.println("测试方式3：数据+'' 结束执行!" + (System.currentTimeMillis() - startTime3));
	}
}
