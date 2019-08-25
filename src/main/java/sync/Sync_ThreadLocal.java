package sync;

import common.DateConstant;
import utils.DateUtil.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <Description> ThreadLocal是一种把变量放到线程本地的方式来实现线程同步的<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月24日 <br>
 * @see sync <br>
 * @since V1.0 <br>
 */
public class Sync_ThreadLocal {
    private static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DateConstant.DATETIME_FORMAT_17);
        }
    };

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            Date date = DateUtil.getCurrentDate();
            System.out.println(Thread.currentThread().getName() + ": " + DateUtil.data2String(date, DateConstant.DATETIME_FORMAT_17));
            System.out.println(dateFormatThreadLocal.get().format(date));
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            Date date = DateUtil.getCurrentDate();
            System.out.println(Thread.currentThread().getName() + ": " + DateUtil.data2String(date, DateConstant.DATETIME_FORMAT_17));
            System.out.println(dateFormatThreadLocal.get().format(date));
        }).start();
    }
}
