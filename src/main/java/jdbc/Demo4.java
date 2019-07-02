package jdbc;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * <Description> 测试时间处理(java.sql.Date,Time,Timestamp)，取出指定时间段的数据<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年06月30日 <br>
 * @see jdbc <br>
 * @since V1.0 <br>
 */
public class Demo4 {

    /**
     * 将字符串代表的时间转为long数字(格式：yyyy-MM-dd hh:mm:ss)
     *
     * @param dateStr
     * @return
     */
    public static long str2DateTime(String dateStr) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        try {
            return format.parse(dateStr).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.建立数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&generateSimpleParameterMetadata=true", "root", "fyjjhy123!@#");
            ps = conn.prepareStatement("select * from major where create_time > ? and create_time < ?");
            java.sql.Date start = new java.sql.Date(str2DateTime("2019-06-01 00:00:00"));
            java.sql.Date end = new java.sql.Date(str2DateTime("2019-06-24 00:00:00"));

            ps.setObject(1, start);
            ps.setObject(2, end);

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("id") + "--" + rs.getString("name") + "--" + rs.getDate("create_time"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
