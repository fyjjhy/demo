package basics.date;

import common.DateConstant;
import utils.DateUtil.DateUtil;

import java.util.Date;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月12日 <br>
 * @see basics.date <br>
 * @since V1.0 <br>
 */
public class DateDemo2 {

    public static void main(String[] args) {
        Date date = DateUtil.getCurrentDate();
        String dateStr = DateUtil.data2String(date, DateConstant.DATE_FORMAT_8);
        Date date2 = DateUtil.string2Date(dateStr);
        dateStr = new StringBuilder().append(date2).toString();
        System.out.println(dateStr);
    }
}
