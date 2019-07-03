package thread;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年05月04日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class RunnableCallable2 implements Runnable {

    private String acceptStr;

    public RunnableCallable2(String acceptStr) {
        this.acceptStr = acceptStr;
    }

    @Override
    public void run() {
        // 线程阻塞 1 秒，此时有异常产生，只能在方法内部消化，无法上抛
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 最终处理结果无法返回
        System.out.println("hello : " + this.acceptStr);
    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableCallable2("my runable test!");
        long beginTime = System.currentTimeMillis();
        new Thread(runnable).start();
        long endTime = System.currentTimeMillis();
        System.out.println("cast : " + (endTime - beginTime) / 1000 + " second!");
    }
}
