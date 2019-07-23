package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

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
public class RandomAccessFileDemo5 {
    static long chars=0;//chars指的是字符数

    public static void main(String[] args) throws IOException {
        String userHome = System.getProperty("user.home");
        String path = new StringBuffer(userHome).append(File.separator)
                .append("log").append(File.separator)
                .append("hbasesoft").append(File.separator)
                .append("hello-world").append(File.separator)
                .append("trans.json.2019-07-22.gz").toString();
        RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
        randomAccessFile.seek(chars);
        String content;
        int line = 0;
        while ((content = randomAccessFile.readLine()) != null) {
            line++;
            System.out.println("第"+ line +"行内容content="+ new String(content.getBytes("ISO-8859-1"), "utf-8"));
        }
    }
}
