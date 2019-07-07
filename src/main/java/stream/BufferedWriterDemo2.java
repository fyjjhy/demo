package stream;

import common.CommonConstant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
public class BufferedWriterDemo2 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String content1 = "中国移动咪咕阅读基地";
        String content2 = "中国移动咪咕影视基地";
        bufferedWriter.write(content1);
        bufferedWriter.write("\r\n");
        bufferedWriter.write(content2);
        bufferedWriter.close();
        fileWriter.close();
    }
}
