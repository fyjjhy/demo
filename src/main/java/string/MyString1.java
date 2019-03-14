package string;

import java.text.DecimalFormat;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/14
 * @see string <br>
 * @since V1.0<br>
 */
public class MyString1 {
	public static void main(String[] args) {
		// JAVA补字符串固定位数自增，位数不够左补0操作
		String maxCode = "SJHC00101";
		String numStr = maxCode.substring(4);
		System.out.println(numStr);
		DecimalFormat countFormat = new DecimalFormat("00000");
		System.out.println("SJHC" + countFormat.format(Integer.parseInt(numStr)+1));
		// 总发行量的位数
		StringBuilder pattern = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			pattern.append("0");
		}
		DecimalFormat decimalFormat = new DecimalFormat(pattern.toString());
		for (int i = 1; i <= 10; i++) {
			// 优惠券编号
			System.out.println(new StringBuilder().append("Q0001")
					.append(decimalFormat.format(i)).toString());


		}
	}
}
