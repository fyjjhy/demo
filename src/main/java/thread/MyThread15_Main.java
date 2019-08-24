package thread;

/**
 * <Description> 创建线程<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月22日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class MyThread15_Main {
    public static void main(String[] args) throws InterruptedException {
        // 实例化线程任务类
        MyThread15_Task task = new MyThread15_Task();
        // 创建线程对象,并将线程任务类作为构造方法参数传入
        new Thread(task, "MyThread-01").start();
        // 演示主线程继续向下执行
        while (true) {
            task.printThreadInfo();
            Thread.sleep(1000);
        }
    }
}
