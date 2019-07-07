package stream;

import java.net.InetAddress;
import java.net.UnknownHostException;

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
public class SocketDemo3 {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
        inetAddress = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress);
    }
}
