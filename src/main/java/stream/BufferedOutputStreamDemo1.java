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
public class BufferedOutputStreamDemo1 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        OutputStream outputStream = new FileOutputStream(path, true);
        OutputStream os = new BufferedOutputStream(outputStream);
        String content = "中国果酒";
        byte[] bytes = content.getBytes();
        os.write(bytes);
        os.close();
        outputStream.close();
    }
}
