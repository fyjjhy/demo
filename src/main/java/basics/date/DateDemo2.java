package basics.date;

import java.util.Date;

import common.DateConstant;
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
		String dateStr = "Tue Mar 05 00:00:00 CST 2019";
		System.out.println(DateUtil.string2Date(dateStr));

		Date date = DateUtil.getCurrentDate();
		dateStr = DateUtil.data2String(date, DateConstant.DATE_FORMAT_8);
		Date date2 = DateUtil.string2Date(dateStr);
		dateStr = new StringBuilder().append(date2).toString();
		System.out.println(dateStr);
	}
}
