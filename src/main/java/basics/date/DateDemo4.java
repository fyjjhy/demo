package basics.date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/15
 * @see basics.date <br>
 * @since V1.0<br>
 */
public class DateDemo4 {

	private static final Long[] delayTimeArray = new Long[]{1L, 5L, 10L, 30L, 60L, 300L, 600L, 900L, 1800L, 3600L, 7200L, 10800L, 14400L, 18000L, 21600L, 28800L, 43200L, 86400L};

	public static void main(String[] args) {
		int nowHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		System.out.println(nowHour);

		long key = 3;
		List<Long> longList = new ArrayList(Arrays.asList(delayTimeArray));
		if (longList.indexOf(key) >= 0) {
			System.out.println(longList.indexOf(key) + 1);
		}
	}
}
