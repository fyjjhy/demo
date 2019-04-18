package stream;

import utils.DateUtil.DateUtil;
import common.DateConstant;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/28
 * @see stream <br>
 * @since V1.0<br>
 */
public class TestGetNowDate {

	public static void main(String[] args) {
		String nowDateStr = DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_19);
		System.out.println(nowDateStr);
	}
}
