package basics;

/**
 * <Description> 0.1+0.2结果却不等于0.3<br>
 *【计算机内部如何表示数】
 * 计算机用位来储存及处理数据。
 * 每一个二进制数(二进制串)都--对应一个十进制数。
 *【计算机内部如何表示整数】
 *【文档地址】
 *【链接地址】
 * https://www.liangzl.com/get-article-detail-16071.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/11
 * @see basics <br>
 * @since V1.0<br>
 */
public class FloatDemo1 {

	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;
		System.out.println((a + b) > 0.3); // true
		System.out.println(a * a);
		System.out.println(1000000000000000128l == 1000000000000000129l);
	}
}
