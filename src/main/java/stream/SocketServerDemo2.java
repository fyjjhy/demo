package stream;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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
public class SocketServerDemo2 {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5555);
        Socket socket = serverSocket.accept();
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println("服务器端：开源中国杭州论坛");
        printStream.println("服务器端：杭州G20峰会");
        // 关闭输出流，表明输出已经结束
        socket.shutdownOutput();
        // 判断socket是否关闭
        System.out.println(socket.isClosed());
        Scanner scanner = new Scanner(socket.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println("scanner:" + scanner.nextLine());
        }
        scanner.close();
        printStream.close();
        socket.close();
    }
}
