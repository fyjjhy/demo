package stream;

import java.io.IOException;
import java.net.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月07日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class UDPServerDemo1 {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String content = "hello world, my name is fyj";
        // 构造用于发送的数据包，指定主机和端口号
        DatagramPacket packet = new DatagramPacket(
                content.getBytes(), content.length(), InetAddress.getByName("localhost"), 6666);
        datagramSocket.send(packet);

        // 读取从客户端发送过来的响应
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket);
        String str = new String(bytes, 0, datagramPacket.getLength());
        System.out.println(str);
        datagramSocket.close();

    }
}
