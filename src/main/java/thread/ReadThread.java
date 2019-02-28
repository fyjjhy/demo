package thread;

import java.io.PipedInputStream;

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
public class ReadThread implements Runnable {

	private PipedInputStream pipedInputStream;

	public ReadThread(PipedInputStream pipedInputStream) {
		this.pipedInputStream = pipedInputStream;
	}

	@Override
	public void run() {
		say("R:读取前没有数据,阻塞中...等待数据传过来再输出到控制台...");
	}

	// 打印
	public static void say (Object object) {
		System.out.println(object);
	}
}
