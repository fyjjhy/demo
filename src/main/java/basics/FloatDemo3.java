package basics;

/**
 * <Description> 0.1 + 0.1 为什么等于0.2<br>
 * 【描述】
 * 两个有舍入误差的值在求和时，相互抵消了
 * 【表示】
 * 二进制能精确地表示位数有限且分母是2的倍数的小数。
 * 【注意】
 * 不要直接比较两个浮点数的大小
 * 【总结】
 * 1.为什么0.1 + 0.2不等于0.3。因为计算机不能精确表示0.1,0.2这样的浮点数，
 * 计算时使用的是带有舍入误差的数
 * 2.并不是所有的浮点数在计算机内部都存在舍入误差
 * 3.具有舍入误差的运算结果可能会符合我们的期望，原因可能是"负负得正"
 * 4.(1)使用整型代替浮点数计算；(2)不要直接比较两个浮点数，而应该使用浮点数运算库
 * 后端：BigDecimal
 * 前端：BigNumber
 * 【链接地址】
 * https://www.liangzl.com/get-article-detail-16071.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/11
 * @see basics <br>
 * @since V1.0<br>
 */
public class FloatDemo3 {

	public static void main(String[] args) {
		System.out.println((0.1 + 0.3) == 0.4);// true
		System.out.println(0.1 + 0.2);
	}
}
