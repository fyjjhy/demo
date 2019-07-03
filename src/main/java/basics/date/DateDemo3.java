package basics.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import common.DateConstant;
import utils.DateUtil.DateUtil;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/9
 * @see basics.date <br>
 * @since V1.0<br>
 */
public class DateDemo3 {

	public static void main(String[] args) {
		Date date = DateUtil.getCurrentDate();
		String dateStr = DateUtil.data2String(date, DateConstant.DATETIME_FORMAT_17);
		System.out.println(dateStr);
	}
}
