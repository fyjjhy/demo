package stream.bufferedStream;

import java.io.*;

import org.apache.commons.io.IOUtils;

import stream.common.CommonConstant;

/**
 * <Description> BufferedOutputStream和BufferedInputStream包装流<br>
 * File类不负责数据的输入和输出，只是用来管理磁盘文件和目录
 * @author 孙兆欣<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate Create in 2019/2/28
 * @see stream.bufferedStream <br>
 * @since V1.0<br>
 */
public class BufferedStream {

	public static void main(String[] args) {
		// 写入、读取抽象路径
		String path = new StringBuilder()
				.append("bufferedStream").toString();
		// 根据该路径判断文件是否存在
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
		// 在该路径下创建文件
		// 文件名
		String fileName = System.currentTimeMillis() + "";
		File tempFile = new File(path, fileName + ".txt");
		// 往文件中写数据
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(tempFile);
			// 用缓冲流装饰文件输出流，为文件输出流添加缓存功能
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			String writeData = "java.io.File用于表示文件(目录)，也就是说可以通过File类在程序中操作硬盘上的文件或目录";
			bufferedOutputStream.write(writeData.getBytes());
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			IOUtils.closeQuietly(fileOutputStream);
		}

		// 读取文件中内容
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(tempFile);
			// 用缓冲流装饰文件输出流，为文件输出流添加缓存功能
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			byte[] readData = new byte[1024];
			int pos = 0;
			while ((pos = fileInputStream.read(readData)) != -1) {
				System.out.println(new String(readData, 0, pos));
			}
			bufferedInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			IOUtils.closeQuietly(fileInputStream);
		}
	}
}
