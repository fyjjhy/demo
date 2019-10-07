package jdbc;

import java.sql.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月03日 <br>
 * @see jdbc <br>
 * @since V1.0 <br>
 */
public class ConnectionPoolTest {
    public static void main(String[] args) {
        try {
            // 单例模式创建连接池对象
            ConnectionPool connectionPool = ConnectionPoolUtils.getPool();
            // SQL测试语句
            String sql = "select * from major";
            // 设定程序运行起始时间
            long start = System.currentTimeMillis();
            // 循环测试100次数据库连接
            for (int i = 0; i < 100; i++) {
                // 从链接库中获取一个可用的连接
                Connection connection = connectionPool.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    // System.out.println("查询结果" + name);
                }
                resultSet.close();
                statement.close();
                // 连接使用完后释放连接到连接池
                connectionPool.returnConnection(connection);
            }
            System.out.println("经过100次的循环调用，使用连接池花费的时间:"+ (System.currentTimeMillis() - start) + "ms");
            // 关闭数据库连接池。注意：这个耗时比较大
            connectionPool.closeConnectionPool();
            // 设定程序运行起始时间
            start = System.currentTimeMillis();

            /** 不使用连接池创建100个连接的时间 */
            // 导入驱动
            Class.forName("com.mysql.jdbc.Driver");
            for (int i = 0; i < 100; i++) {
                // 创建连接
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&generateSimpleParameterMetadata=true",
                        "root",
                        "fyjjhy123!@#"
                );
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    // System.out.println("查询结果" + name);
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
            System.out.println("经过100次的循环调用，不使用连接池花费的时间:"
                    + (System.currentTimeMillis() - start) + "ms");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
