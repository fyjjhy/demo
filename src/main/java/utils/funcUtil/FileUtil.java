package utils.funcUtil;

import utils.DateUtil.DateUtil;

import java.io.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/1
 * @see DateUtil.funcUtil <br>
 * @since V1.0<br>
 */
public final class FileUtil {

	// 新建目录
	public static void newFolder(String newFolder) {
		File file = new File(newFolder);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	// 新建文件
	public static File newFile (String newFilePath) {
		File file = new File(newFilePath);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		return file;
	}

	// 删除文件
	public static void deleteFile(String filePath) {
		try {
			File file = new File(filePath);
			file.delete();
		} catch (Exception e) {
			System.out.println("删除文件操作有误!");
			e.printStackTrace();
		}
	}


	/**
	 * Description: 删除文件夹<br>
	 *
	 * @author 付永杰<br>
	 * @taskId <br>
	 * @param folderPath
	 * @return <br>
	 */
	public static void deleteFolder(String folderPath) {
		try {
			// 删除文件夹中的全部内容
			delAllFile(folderPath);
			File file = new File(folderPath);
			file.delete(); // 删除空文件夹
		} catch (Exception e) {
			System.out.println("删除文件夹有误!");
			e.printStackTrace();
		}
	}

	/**
	 * Description: 删除文件夹中的所有文件<br>
	 *
	 * @author 付永杰<br>
	 * @taskId <br>
	 * @param folderPath
	 * @return <br>
	 */
	public static void delAllFile(String folderPath) {
		File file = new File(folderPath);
		if (!file.exists()) {
			return;
		}

		if (!file.isDirectory()) {
			return;
		}
		String[] tempList = file.list();
		File temp = null;
		String tempPath = null;
		for (int i = 0; i < tempList.length; i++) {
			if (folderPath.endsWith(File.separator)) {
				tempPath = folderPath + tempList[i];
				temp = new File(tempPath);
			}
			else {
				tempPath = folderPath + File.separator + tempList[i];
				temp = new File(tempPath);
			}
			if (temp.isFile()) {
				temp.delete();
			}
			if (temp.isDirectory()) {
				delAllFile(tempPath); // 先删除文件夹中的文件
				deleteFolder(tempPath); // 再删除空文件夹
			}
		}
	}

	/**
	 * Description: 复制单个文件<br>
	 *
	 * @author 付永杰<br>
	 * @taskId <br>
	 * @param oldPath
	 * @param newPath
	 * @return <br>
	 */
	public static void copyFile(String oldPath, String newPath) {
		// 判断oldPath抽象路径名对应的文件是否存在
		File file = new File(oldPath);
		if (file.exists()) {
			// 读取oldPath文件中的数据
			try (
					FileInputStream fileInputStream = new FileInputStream(file);
					FileOutputStream fileOutputStream = new FileOutputStream(newPath);
			) {
				byte[] buf = new byte[1024];
				int len;
				while ((len = fileInputStream.read(buf)) != -1) {
					fileOutputStream.write(buf, 0, len);
				}
			}
			catch (Exception e) {
				throw new RuntimeException("复制单个文件失败!");
			}
		}
	}

	/**
	 * Description: 复制整个文件夹<br>
	 *
	 * @author 付永杰<br>
	 * @taskId <br>
	 * @param oldFolder
	 * @param newFolder
	 * @return <br>
	 */
	public static void copyFolder(String oldFolder, String newFolder) {
		try {
			// 判断oldFolder表示的抽象路径名是否存在
			File file = new File(oldFolder);
			if (!file.exists()) {
				return;
			}

			if (!file.isDirectory()) {
				return;
			}

			String[] tempList = file.list();
			File temp = null;
			String tempPath = null;
			for (int i = 0; i < tempList.length; i++) {
				if (oldFolder.endsWith(File.separator)) {
					tempPath = oldFolder + tempList[i];
				}
				else {
					tempPath = oldFolder + File.separator + tempList[i];
				}
				temp = new File(tempPath);
				if (temp.isFile()) {
					FileInputStream fileInputStream = new FileInputStream(temp);
					FileOutputStream fileOutputStream = new FileOutputStream(newFolder);
					byte[] buf = new byte[1024];
					int len;
					while ((len = fileInputStream.read(buf)) != 1) {
						fileOutputStream.write(buf, 0, len);
					}
					fileOutputStream.flush();
					fileOutputStream.close();
					fileInputStream.close();
				}

				if (file.isDirectory()) { // 如果是子文件夹
					copyFolder(tempPath, newFolder);
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Description: 移动文件到指定目录<br>
	 *
	 * @author 付永杰<br>
	 * @taskId <br>
	 * @param oldPath
	 * @param newPath
	 * @return <br>
	 */
	public static void moveFile(String oldPath, String newPath) {
		copyFile(oldPath, newPath);
		deleteFile(oldPath);
	}

	/**
	 * Description: 移动目录到指定目录<br>
	 *
	 * @author 付永杰<br>
	 * @taskId <br>
	 * @param oldFolder
	 * @param newFolder
	 * @return <br>
	 */
	public static void moveFolder(String oldFolder, String newFolder) {
		copyFolder(oldFolder, newFolder);
		deleteFolder(oldFolder);
	}
}
