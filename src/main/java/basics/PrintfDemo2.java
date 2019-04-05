package basics;

/**
 * <Description> 不同转换符实现不同数据类型到字符串的转换<br>
 * 【链接】
 * https://www.cnblogs.com/dalingxuan/p/9357404.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月05日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class PrintfDemo2 {

    public static void main(String[] args) {
        String s = null;
        s = String.format("Hi, %s", "王力");
        System.out.println(s);
        s = String.format("Hi, %s:%s.%s", "王南", "王力", "王张");
        System.out.println(s);
        System.out.printf("字母a的大写是：%c %n", 'A');
        System.out.printf("3 > 7的结果是：%b %n", 3 > 7);
        System.out.printf("100的一半是：%d %n", 100 / 2);
        System.out.printf("100的十六进制是：%x %n", 100);
        System.out.printf("100的八进制是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50 * 0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50 * 0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50 * 0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50 * 0.85);
        System.out.printf("上面的折扣是：%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');
    }
}
