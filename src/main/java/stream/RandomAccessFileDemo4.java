package stream;

import common.CommonConstant;
import org.apache.commons.lang3.StringUtils;

import java.io.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月06日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class RandomAccessFileDemo4 {

    public static void main(String[] args) {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        try {
            insert(path, 5, "插入的内容");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void insert(String fileName, long pos, String content) throws IOException {
        // 创建临时空文件
        String tempPath = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("cmu.txt").toString();
        File tempFile = new File(tempPath);
        tempFile.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        randomAccessFile.seek(pos);
        byte[] bytes = new byte[4];
        int num = 0;
        while ((num = randomAccessFile.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, num);
        }
        randomAccessFile.seek(pos);
        randomAccessFile.write(content.getBytes());
        FileInputStream fileInputStream = new FileInputStream(tempFile);
        while ((num = fileInputStream.read(bytes)) != -1) {
            randomAccessFile.write(bytes, 0, num);
        }
        fileInputStream.close();
        fileOutputStream.close();
        randomAccessFile.close();
    }
}
