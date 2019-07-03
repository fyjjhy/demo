//package memcached;
//
//import net.spy.memcached.MemcachedClient;
//
//import java.io.IOException;
//import java.net.InetSocketAddress;
//
///**
// * <Description> 连接实例<br>
// *
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年05月26日 <br>
// * @see memcached <br>
// * @since V1.0 <br>
// */
//public class MemcachedDemo1 {
//
//    public static void main(String[] args) {
//        try {
//            // 本地连接Memcached服务
//            MemcachedClient memcachedClient = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
//            System.out.println("connection to server successful.");
//
//            // 关闭连接
//            memcachedClient.shutdown();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
