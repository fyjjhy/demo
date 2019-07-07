package stream;

import java.net.MalformedURLException;
import java.net.URL;

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
public class SocketDemo1 {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://i.cnblogs.com/EditPosts.aspx?opt=1");
        String file = url.getFile();
        System.out.println(file);
        String host = url.getHost();
        System.out.println(host);
        int port = url.getPort();
        System.out.println(port);
        String query = url.getQuery();
        System.out.println(query);
        String protocol = url.getProtocol();
        System.out.println(protocol);
    }
}
