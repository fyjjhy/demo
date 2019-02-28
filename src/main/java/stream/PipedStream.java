package stream.pipedStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * <Description> PipedInputStream和PipedOutputStream<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/28
 * @see stream.pipedStream <br>
 * @since V1.0<br>
 */
public class PipedStream {

	public static void main(String[] args) {
		// 管道输入流
		PipedInputStream pipedInputStream = new PipedInputStream();
		// 管道输出流
		PipedOutputStream pipedOutputStream = new PipedOutputStream();
		// 输入流与输出流连接
		try {
			pipedInputStream.connect(pipedOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
