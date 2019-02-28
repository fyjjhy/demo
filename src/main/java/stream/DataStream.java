package stream;

import common.CommonConstant;
import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * <Description> DataOutputStream和DataInputStream(包装流)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/28
 * @see stream.DataStream <br>
 * @since V1.0<br>
 */
public class DataStream {

	public static void main(String[] args) {
		// 定义输入输出流的目录
		String path = new StringBuilder().append(CommonConstant.FILE_PATH)
				.append("dataStream").toString();
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
		String fileName = System.currentTimeMillis() + "";
		File tempFile = new File(path, fileName + ".txt");
		DataOutputStream dataOutputStream = null;
		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream(tempFile));
			dataOutputStream.writeUTF("允许应用程序以与机器无关的方式从底层输入流中读取基本java数据类型");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			IOUtils.closeQuietly(dataOutputStream);
		}

		DataInputStream dataInputStream = null;
		try {
			dataInputStream = new DataInputStream(new FileInputStream(tempFile));
			String s = dataInputStream.readUTF();
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			IOUtils.closeQuietly(dataInputStream);
		}
	}
}
