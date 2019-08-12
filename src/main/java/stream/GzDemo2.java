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
 * @CreateDate 2019年07月23日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class GzDemo2 {

    public static void main(String[] args) throws IOException {
        String userHome = System.getProperty("user.home");
        String path = new StringBuffer(userHome).append(File.separator)
                .append("log").append(File.separator)
                .append("hbasesoft").append(File.separator)
                .append("hello-world").append(File.separator).toString();
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        // String fileName = path + "trans.json.2019-07-22.gz";
        String fileName = path + "trans.json";
        file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int readContent = 0;
        if ((readContent = fileInputStream.read()) != -1) {
            System.out.println("readContent = " + readContent);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new GZIPInputStream(new FileInputStream(fileName))));
            String content = null;
            while (StringUtils.isNotEmpty(content = bufferedReader.readLine())) {
                System.out.println(content);
            }
        }
        else {
            System.out.println("该文件为空文件或者该文件已经被读取结束!");
        }
    }
}
