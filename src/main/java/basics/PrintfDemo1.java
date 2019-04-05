package basics;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月05日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class PrintfDemo1 {

    public static void main(String[] args) {
        double d = 345.678;
        String s = "你好!";
        int i = 1234;
        // "%"表示进行格式化输出，"%"之后的内容为格式的定义
        System.out.printf("%f", d); // f表示格式化输出浮点数
        System.out.println("\n");
        System.out.printf("%9.2f", d); // "9.2"中的9表示输出的长度，2表示小数点后面的位数。
        System.out.println("\n");
        System.out.printf("%+9.2f", d); // "+"表示输出的数带正负号
        System.out.println("\n");
        System.out.printf("%-9.4f", d); // "-"表示输出的数左对齐(默认右对齐)
        System.out.println("\n");
        System.out.printf("%+-9.4f", d); // "+-"表示输出的数带正负号且左对齐
        System.out.println("\n");
        System.out.printf("%d", i); // "d"表示输出十进制整数
        System.out.println("\n");
        System.out.printf("%o", i); // "o"表示输出八进制整数
        System.out.println("\n");
        System.out.printf("%x", i); // "x"表示输出十六进制整数
        System.out.println("\n");
        System.out.printf("%#x", i); // "#x"表示输出带十六进制标志的整数
        System.out.println("\n");
        System.out.printf("%s", s); // "s"表示输出字符串
        System.out.println("\n");
        System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s", d, i, s); // 注意顺序
        System.out.println("\n");
        System.out.printf("字符串：%2$s，%1$d的十六进制数：%1$#x", i, s);
        double x = 2.0 / 3;
        // 保留2位小鼠，用printf和println
//        System.out.println("x is " + (int)(x * 100) / 100.0);
//        System.out.println("x is " + (int)(x * 100) / 100.0);
        System.out.println("x is " + (int)(x * 100) / 100.0);
        System.out.printf("%.2f", x);
    }
}
