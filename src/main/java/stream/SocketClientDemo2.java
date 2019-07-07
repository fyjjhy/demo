package stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
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
public class SocketClientDemo2 {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5555);
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int flag = 0;
        while ((flag = inputStream.read(bytes, 0, bytes.length)) != -1) {
            String content = new String(bytes, 0, bytes.length);
            System.out.println(content);
        }
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println("客户端：欢迎参加开源中国论坛");
        printStream.println("客户端：欢迎参加G20峰会");
        printStream.close();
        inputStream.close();
        socket.close();
    }
}
