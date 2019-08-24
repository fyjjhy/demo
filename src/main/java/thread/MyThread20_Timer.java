package thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月22日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread20_Timer {
    public static void main(String[] args) {
        // 创建定时器
        Timer timer = new Timer();

        // 提交计划任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务执行了。。。");
            }
        }, new Date(), 1000);
    }
}
