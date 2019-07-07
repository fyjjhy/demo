package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

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
public class SocketClientDemo1 {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String content = bufferedReader.readLine();
        System.out.println(content);
        bufferedReader.close();
        inputStream.close();
        socket.close();
    }
}
