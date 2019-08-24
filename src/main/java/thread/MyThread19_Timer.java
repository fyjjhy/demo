package thread;

import common.DateConstant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 * <Description> 定时任务(指定时间点执行)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月22日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread19_Timer {
    private static final SimpleDateFormat format = new SimpleDateFormat(DateConstant.DATETIME_FORMAT_19);

    public static void main(String[] args) throws ParseException {
        // 创建定时器
        Timer timer = new Timer();
        // 提交计划任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务执行了...");
            }
        }, format.parse("2019-08-22 14:15:00"));
    }
}
