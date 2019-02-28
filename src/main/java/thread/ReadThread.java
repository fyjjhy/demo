package thread;

import java.io.PipedInputStream;

/**
 * <Description>
 * 方式一:
 * 1.开始时，管道输出流阻塞，执行管道输入流
 * 2.管道输入流读取数据时发现，没有数据可以读取
 * 3.执行管道输出流写入数据，如果没有可写入数据
 * 4.执行管道输入流抛出异常
 * 方式二:
 * 1.开始时，管道输出流阻塞，执行管道输入流
 * 2.管道输入流读取数据时发现，没有数据可以读取
 * 3.执行管道输出流写入数据
 * 4.执行管道输入流读取数据，解除read阻塞
 * <br>
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
		try {
			say("R:读取前没有数据,阻塞中...等待数据传过来再输出到控制台...");
			byte[] buff = new byte[1024];
			int len = pipedInputStream.read(buff);
			say("R:读取数据成功，阻塞解除...");
			String s = new String(buff, 0, len);
			System.out.println(s);
			pipedInputStream.close();
		} catch (Exception e) {
			throw new RuntimeException("R:管道读取流失败!");
		}
	}

	// 打印
	public static void say (Object object) {
		System.out.println(object);
	}
}
