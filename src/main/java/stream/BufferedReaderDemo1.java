package stream;

import common.CommonConstant;
import org.apache.commons.lang.StringUtils;

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
public class BufferedReaderDemo1 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String content = null;
        while (StringUtils.isNotEmpty(content = reader.readLine())) {
            System.out.println(content);
        }
        reader.close();
    }
}
