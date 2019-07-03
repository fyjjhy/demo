package jdbc;

import java.sql.*;
import java.util.Random;

import common.CommonUtil;

/**
 * <Description> 测试时间处理(java.sql.Date,Time,Timestamp)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年06月30日 <br>
 * @see jdbc <br>
 * @since V1.0 <br>
 */
public class Demo3 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // 1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.建立数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&generateSimpleParameterMetadata=true","root","fyjjhy123!@#");

            for (int i = 0; i < 1000; i++) {

                ps = conn.prepareStatement("insert into major(ID, name, remark, SP_ID, create_time, update_time)values(?,?,?,?,?,?)");
                ps.setObject(1, CommonUtil.getTransactionID());
                ps.setObject(2, "小高" + i);
                ps.setObject(3, "123");
                ps.setObject(4, "0");
                //随机时间
                int random = 1000000000 + new Random().nextInt(1000000000);
                //插入随机时间
                java.sql.Date date = new java.sql.Date(System.currentTimeMillis() - random);
                //如果需要插入指定时间，可以使用Calendar、DateFormat
                java.sql.Timestamp stamp = new Timestamp(System.currentTimeMillis());
                ps.setDate(5, date);
                ps.setTimestamp(6, stamp);
                ps.execute();
            }

            System.out.println("插入");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{

            try {
                if (ps!=null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
