package jdbc;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

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
public class DBCPUtils {
    // 定义一个连接池对象
    private static DataSource dataSource;
    static {
        try {
            Properties properties = new Properties();
            properties.load(DBCPUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
            // 得到一个连接池对象
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化连接错误，请检查配置文件!");
        }
    }

    /**
     * Description: 从池中获取一个连接<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void closeAll(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
