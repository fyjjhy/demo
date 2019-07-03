//package memcached;
//
//import java.net.InetSocketAddress;
//import java.util.concurrent.Future;
//
//import net.spy.memcached.MemcachedClient;
//
///**
// * <Description> set操作实例<br>
// *
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年05月26日 <br>
// * @see memcached <br>
// * @since V1.0 <br>
// */
//public class MemcachedDemo2 {
//
//    public static void main(String[] args) {
//        try{
//            // 连接本地的 Memcached 服务
//            MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
//            System.out.println("Connection to server sucessful.");
//
//            // 存储数据
//            Future fo = mcc.set("runoob", 900, "Free Education");
//
//            // 查看存储状态
//            System.out.println("set status:" + fo.get());
//
//            // 输出值
//            System.out.println("runoob value in cache - " + mcc.get("runoob"));
//
//            // 关闭连接
//            mcc.shutdown();
//
//        }catch(Exception ex){
//            System.out.println( ex.getMessage() );
//        }
//    }
//}
