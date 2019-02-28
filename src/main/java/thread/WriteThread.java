package thread;

import java.io.PipedOutputStream;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/28
 * @see thread <br>
 * @since V1.0<br>
 */
public class WriteThread implements Runnable{

    private PipedOutputStream pipedOutputStream;

    public WriteThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {

        try {
            say("W:开始将数据写入:但等个5秒让我们观察...");
            Thread.sleep(5000); // 释放cpu执行权5秒
            pipedOutputStream.write(("" +
                    "W:管道流内部在实现时还有大量的对同步数据的处理。" +
                    "管道输出流和管道输入流执行时不能相互阻塞，所以一般要开启独立线程分别执行").getBytes());
            pipedOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException("W:WriteThread写入失败...");
        }
    }

    public static void say (Object object) {
        System.out.println(object);
    }
}
