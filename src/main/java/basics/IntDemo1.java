package basics;

/**
 * <Description> a = a + b 与 a += b 的区别<br>
 * 【运算符】
 * +=隐式的将加操作的结果类型强制转换为持有结果的类型。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see basics.operator <br>
 * @since V1.0 <br>
 */
public class IntDemo1 {

    public static void main(String[] args) {
        byte a = 127;
        byte b = 127;
        b = (byte) (a + b);
        b += a;
        System.out.println(b);
    }
}
