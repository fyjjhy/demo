package stream;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
public class GzDemo1 {

    public static void main(String[] args) throws IOException {
        String userHome = System.getProperty("user.home");
        String path = new StringBuffer(userHome).append(File.separator)
                .append("log").append(File.separator)
                .append("hbasesoft").append(File.separator)
                .append("hello-world").append(File.separator)
                .append("trans.json.2019-07-22.gz").toString();
        InputStream inputStream = new GZIPInputStream(new FileInputStream(path));
        List<String> list =  IOUtils.readLines(inputStream, "UTF-8");
        IntStream.range(0, list.size())
                .mapToObj(i -> {
                    System.out.println("第"+ i +"行内容content="+ list.get(i));
                    return list.get(i);
                }).collect(Collectors.toList());
    }
}
