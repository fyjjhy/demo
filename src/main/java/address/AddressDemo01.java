package address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月12日 <br>
 * @see address <br>
 * @since V1.0 <br>
 */
public class AddressDemo01 {

    public static void main(String[] args) throws UnknownHostException {
        String addr = InetAddress.getLocalHost().getHostAddress();
        System.out.println(addr);

    }

}
