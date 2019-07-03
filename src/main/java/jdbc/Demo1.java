package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import common.CommonUtil;

/**
 * <Description> 测试结果集的用法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年06月30日 <br>
 * @see jdbc <br>
 * @since V1.0 <br>
 */
public class Demo1 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            // 1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.建立数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&generateSimpleParameterMetadata=true","root","fyjjhy123!@#");

            connection.setAutoCommit(false);
            long start = System.currentTimeMillis();
            // 3.创建执行sql语句的statement对象
            statement = connection.createStatement();
            for (int i = 0; i < 20000; i++) {
                String id = CommonUtil.getTransactionID();
                statement.addBatch("INSERT INTO major (ID, name, remark, SP_ID) VALUES (" + i + ",'fuyongjie', 'addBatch', '0')");
            }
            statement.executeBatch();
            connection.commit();
            long end = System.currentTimeMillis();
            System.out.println("插入200000条数据，耗时(ms):" + (end - start));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
