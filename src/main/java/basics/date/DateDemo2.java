package basics.date;

import utils.DateUtil.DateUtil;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/6
 * @see basics.date <br>
 * @since V1.0<br>
 */
public class DateDemo2 {

	public static void main(String[] args) {
		String date = "Tue Mar 05 00:00:00 CST 2019";
		System.out.println(DateUtil.string2Date(date));
	}
}
