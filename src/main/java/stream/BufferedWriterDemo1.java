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
public class BufferedWriterDemo1 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        OutputStream os = new FileOutputStream(path);
        Writer writer = new BufferedWriter(new OutputStreamWriter(os));
        String content1 = "中国移动阅读基地";
        String content2 = "中国移动影视基地";
        writer.write(content1);
        writer.write("\r\n");
        writer.write(content2);
        writer.close();
        os.close();

    }
}
