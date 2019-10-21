package date;

import java.util.Calendar;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月21日 <br>
 * @see date <br>
 * @since V1.0 <br>
 */
public class Demo2 {
    public static void main(String[] args) {
        String dateStr = "2006-02-18";
        String[] arr = dateStr.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Integer.parseInt(arr[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(arr[1]) - 1);
        calendar.set(Calendar.DATE, Integer.parseInt(arr[2]));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        int salary = 0;
        for (int i = 0; i < 24; i++) {
            calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - i);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == 7) {
                salary += 5;
            } else if (dayOfWeek != 1) {
                salary += 10;
            } else {
                salary += 0;
            }
            calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + i);
        }
        System.out.println(salary);
    }
}
