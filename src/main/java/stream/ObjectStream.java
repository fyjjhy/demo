package stream;

import common.CommonConstant;
import entity.Person;

import java.io.*;

/**
 * <Description> ObjectInputStream和ObjectOutputStream<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/28
 * @see ObjectStream <br>
 * @since V1.0<br>
 */
public class ObjectStream {

	public static void main(String[] args) {
		// 定义输入输出文件目录
		String path = new StringBuilder().append(CommonConstant.FILE_PATH)
				.append("objectStream").toString();
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
		// 定义文件名称
		String fileName = System.currentTimeMillis() + "";
		File tempFile = new File(path, fileName + ".txt");
		// 定义输出流
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(tempFile))) {
			objectOutputStream.writeObject(new Person("付某某", 19));
			objectOutputStream.writeObject(new Person("孙某某", 29));
			objectOutputStream.flush();
		} catch (Exception e) {
			System.out.println(e);
		}

		// 定义输入流
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(tempFile))) {
			Person person = null;
			while ((person = (Person) objectInputStream.readObject()) != null) {
				System.out.println(person);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (EOFException e) {
			System.out.println("读取结束");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
