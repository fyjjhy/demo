package stream;

import common.CommonConstant;

import java.io.*;

/**
 * <Description> 覆盖原有内容<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月06日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class FileOutputStreamDemo1 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        OutputStream outputStream = new FileOutputStream(path);
        String content = "中国移动手机阅读";
        byte[] buffer = content.getBytes();
        outputStream.write(buffer);
        outputStream.close();
    }
}
