package stream;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月30日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class GzDemo3 {

    public static void main(String[] args) throws IOException {
        String userHome = System.getProperty("user.home");
        String path = new StringBuilder(userHome).append("/log/hbasesoft/ability-integration-service/trans.json.2019-07-29.gz").toString();
        // 对应的行数99行
        // Unexpected end of ZLIB input stream
        long filePointer = 10L;
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new GZIPInputStream(new FileInputStream(path))));
        bufferedReader.skip(filePointer);
        long i = 0;
        while (StringUtils.isNotEmpty(bufferedReader.readLine())) {
            if ((++i) % 1000 == 0) {
                System.out.println("已读取" + i + "行数据。");
            }
        }
        System.out.println("共读取" + i + "行数据。");
    }
}
