package jdbc;

/**
 * <Description> 连接池工具类，返回唯一的一个数据库连接池对象，单例模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月03日 <br>
 * @see jdbc <br>
 * @since V1.0 <br>
 */
public class ConnectionPoolUtils {

    // 私有静态方法
    private ConnectionPoolUtils() {
    }

    private static ConnectionPool pool = null;

    public static ConnectionPool getPool() {
        if (pool == null) {
            pool = new ConnectionPool(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&generateSimpleParameterMetadata=true",
                    "root",
                    "fyjjhy123!@#");
            try {
                pool.createPool();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pool;
    }
}
