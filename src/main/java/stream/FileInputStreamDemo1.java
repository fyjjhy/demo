package stream;

import common.CommonConstant;

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
public class FileInputStreamDemo1 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        InputStream inputStream = new FileInputStream(path);
        int length = 0;
        byte[] buffer = new byte[20];
        while ((length = inputStream.read(buffer, 0, 20)) != -1) {
            String str = new String(buffer, 0, length);
            System.out.println(str);
        }
        inputStream.close();
    }
}
