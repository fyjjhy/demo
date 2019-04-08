package basics.operator;

/**
 * <Description> 移位运算符<br>
 *【描述】
 * 移位运算符操作的对象就是二进制的位，可以单独用移位运算符来处理int型整数。
 * 【运算符】
 * 1.左移运算符<<，在低位补0
 * 2."有符号"右移运算符>>，使用符号扩展机制，如果值为正，高位补0，如果值为负，高位补1
 * 3."无符号"右移运算符>>>，采用0扩展机制，也就是说，无论值的正负，都在高位补0
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see basics.operator <br>
 * @since V1.0 <br>
 */
public class OperatorDemo4 {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(6297));
        System.out.println(Integer.toBinaryString(-6297));
        System.out.println(Integer.toBinaryString(6297>>5));
        System.out.println(Integer.toBinaryString(-6297>>5));
        System.out.println(Integer.toBinaryString(6297>>>5));
        System.out.println(Integer.toBinaryString(-6297>>>5));
        System.out.println(Integer.toBinaryString(6297<<5));
        System.out.println(Integer.toBinaryString(-6297<<5));
    }
}
