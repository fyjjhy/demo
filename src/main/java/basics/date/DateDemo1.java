package basics.date;

import java.text.SimpleDateFormat;

/**
 * <Description> <br>
 *【java.util.Date和java.sql.Date 区别】
 * java.util.Date 类型写到数据库后存储的值可以到秒;
 * java.sql.Date 类型的写入后只能到日期。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/19
 * @see basics.date <br>
 * @since V1.0<br>
 */
public class DateDemo1 {

	public static void main(String[] args) {
		java.util.Date nowUtil =new java.util.Date();        // java.util.Date
		java.sql.Date nowSql=new java.sql.Date(System.currentTimeMillis());//java.sql.Date

		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(nowUtil));//格式化 输出
		System.out.println(simpleDateFormat.format(nowSql));//格式化 输出
		System.out.println(nowUtil); //直接 输出
		System.out.println(nowSql);  //直接 输出
	}
}
