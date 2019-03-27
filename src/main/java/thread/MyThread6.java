package thread;

import com.hbasesoft.framework.common.utils.logger.LoggerUtil;

/**
 * <Description> 现有线程T1、T2、T3，如何确保T2在T1之后执行，T3在T2之后执行<br>
 * 考点：
 * Thread类的join()，该方法用于等待当前线程结束
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月27日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread6 {

    public static void main(String[] args) {
        // 创建线程T1、T2、T3
        // 使用匿名内部类创建线程
        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行T1线程");
            }
        });

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    T1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行T2线程");
            }
        });

        Thread T3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    T2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行T3线程");
            }
        });

        T1.start();
        T2.start();
        T3.start();
    }
}
