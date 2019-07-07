package stream;

import common.CommonConstant;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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
public class SocketDemo2 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        OutputStream outputStream = new FileOutputStream(path);
        byte[] bytes = new byte[1024];
        int flag = 0;
        while ((flag = inputStream.read(bytes, 0, bytes.length)) != -1) {
            outputStream.write(bytes, 0, flag);
        }
        outputStream.close();
        inputStream.close();
    }
}
