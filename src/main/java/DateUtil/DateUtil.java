package DateUtil;

import common.DateConstant;
import org.apache.commons.lang.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月02日 <br>
 * @see DateUtil <br>
 * @since V1.0 <br>
 */
public final class DateUtil {

    /**
     * Description: 将日期转换成字符串<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param date
     * @param format
     * @return <br>
     */
    public static String data2String(Date date, String format) {
        String result = null;
        if (date != null) {
            DateFormat dateFormat = new SimpleDateFormat(format);
            result = dateFormat.format(date);
        }
        return result;
    }

    /**
     * Description: 将日期转换成字符串<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param date
     * @return <br>
     */
    public static String date2String(Date date) {
        return data2String(date, DateConstant.DATETIME_FORMAT_19);
    }

    /**
     * Description: 将字符串转换成日期<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param date
     * @param format
     * @return <br>
     */
    public static Date string2Date(String date, String format) {
        if (StringUtils.isEmpty(format)) {
            throw new IllegalArgumentException("the date format string is null");
        }
        else {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                return simpleDateFormat.parse(date.trim());
            } catch (ParseException e) {
                throw new IllegalArgumentException("the date string" + date + "is not matching format:" + format, e);
            }
        }
    }

    /**
     * Description: 将日期字符串转换成日期<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param dateStr
     * @return <br>
     */
    public static Date string2Date(String dateStr) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }
        else {
            dateStr = dateStr.trim();
            Date date = null;
            switch (dateStr.length()) {
                case 8:
                    date = string2Date(dateStr, DateConstant.DATE_FORMAT_8);
                    break;
                case 9:
                case 12:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                    default:
                        throw new IllegalArgumentException(dateStr + "不支持的时间格式");
                case 10:
                    date = string2Date(dateStr, dateStr.indexOf("/") != -1 ? DateConstant.DATE_FORMAT_10_2 : DateConstant.DATE_FORMAT_10);
                    break;
                case 11:
                    date = string2Date(dateStr, DateConstant.DATE_FORMAT_11);
                    break;
                case 14:
                    date = string2Date(dateStr, DateConstant.DATETIME_FORMAT_14);
                    break;
                case 17:
                    date = string2Date(dateStr, DateConstant.DATETIME_FORMAT_17);
                    break;
                case 19:
                    date = string2Date(dateStr, dateStr.indexOf("/") != -1 ? DateConstant.DATETIME_FORMAT_19_2 : DateConstant.DATETIME_FORMAT_19);
                    break;
                case 21:
                    date = string2Date(dateStr, DateConstant.DATETIME_FORMAT_21);
                    break;
                case 23:
                    date = string2Date(dateStr, dateStr.indexOf("/") != -1 ? DateConstant.DATETIME_FORMAT_23_2 : DateConstant.DATETIME_FORMAT_23);
            }
            return date;
        }
    }

    /**
     * Description: 获取当前日期<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public static Date getCurrentDate() {
        return new Date();
    }
}
