package jdbc;

import com.hbasesoft.framework.common.utils.CommonUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * <Description> 测试事务的基本概念及用法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年06月30日 <br>
 * @see jdbc <br>
 * @since V1.0 <br>
 */
public class Demo2 {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try {
            // 1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.建立数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&generateSimpleParameterMetadata=true","root","fyjjhy123!@#");
            connection.setAutoCommit(false); //JDBC中默认是true，自动提交事务
            //事务开始
            ps1 = connection.prepareStatement("insert into major(ID, name, remark, SP_ID)values(?, ?, ?, ?)");
            ps1.setObject(1, CommonUtil.getTransactionID());
            ps1.setObject(2, "小高");
            ps1.setObject(3, "123");
            ps1.setObject(4, "0");
            ps1.execute();
            System.out.println("第一次插入");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //模拟执行失败(values的参数写成三个了)
            ps2 = connection.prepareStatement("insert into major(ID, name, remark, SP_ID)values(?, ?, ?, ?, ?)");
            //insert时出现异常,执行conn.rollback
            ps2.setObject(1, CommonUtil.getTransactionID());
            ps2.setObject(2, "小张");
            ps2.setObject(3, "678");
            ps2.setObject(4, "0");
            ps2.execute();
            System.out.println("第二次插入");

            connection.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps1 != null) {
                    ps1.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps2 != null) {
                    ps2.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
