package basics.operator;

/**
 * <Description> <br>
 * 【链接地址】
 * https://blog.csdn.net/qq_35114086/article/details/70173329
 * 【运算】
 * 位运算符只要针对二进制的位进行逻辑运算，包括"与","或","非","异或"
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see basics.operator <br>
 * @since V1.0 <br>
 */
public class OperatorDemo1 {

    public static void main(String[] args) {
        // 与运算符
        int a = 129;
        System.out.println(Integer.toBinaryString(a));
        int b = 128;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a & b);
        // 或运算符
        System.out.println(a | b);
        // 非运算符
        System.out.println((~b));
        System.out.println((~2));
        // 异或运算符
        // 两个操作数的位，相同结果为0，不同结果为1
        System.out.println((a^b));
    }
}
