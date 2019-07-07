package stream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
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
public class SocketServerDemo1 {

    public static void main(String[] args) throws IOException {
        // 创建一个ServerSocket，用于监听客户端Socket连接请求
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("server start");
        // 采用循环方式监听客户端请求
        while (true) {
            // 侦听并接收到此套接字的连接，此方法在连接传入之前一直阻塞
            Socket socket = serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            printStream.print("您好，您收到了来自服务端的中秋祝福");
            printStream.close();
            outputStream.close();
            socket.close();
        }
    }
}
