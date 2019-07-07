package stream;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

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
public class UDPClientDemo1 {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(6666);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);
        String content = new String(bytes, 0, packet.getLength());
        System.out.println("客户端接收数据包：" + content);

        // 接收数据包之后，客户端返回响应
        String str = "welcome, my name is fyj";
        System.out.println("serverIp=" + packet.getAddress() + ", serverPort=" + packet.getPort());
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), packet.getAddress(), packet.getPort());
        socket.send(datagramPacket);
        socket.close();
    }
}
