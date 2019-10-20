package date;

import common.DateConstant;
import org.apache.commons.lang3.StringUtils;
import utils.DateUtil.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月10日 <br>
 * @see date <br>
 * @since V1.0 <br>
 */
public class Demo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateUtil.getCurrentDate());
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date now = calendar.getTime();
        System.out.println(DateUtil.data2String(now, DateConstant.DATETIME_FORMAT_23));
        // Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateUtil.getCurrentDate());
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 14);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date = calendar.getTime();
        System.out.println(DateUtil.data2String(date, DateConstant.DATETIME_FORMAT_23));
        String eff = "2019-10-10 14:14:19";
        Date effTime = DateUtil.string2Date(eff, DateConstant.DATETIME_FORMAT_19);
        System.out.println(DateUtil.data2String(effTime, DateConstant.DATETIME_FORMAT_19));
        calendar.setTime(effTime);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        effTime = calendar.getTime();
        System.out.println(DateUtil.data2String(effTime, DateConstant.DATETIME_FORMAT_23));
        if (date.getTime() >= effTime.getTime()) {
            System.out.println("ok");
        }
    }
}
