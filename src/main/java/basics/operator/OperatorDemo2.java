package basics.operator;

/**
 * <Description> 一元运算符<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see basics.operator <br>
 * @since V1.0 <br>
 */
public class OperatorDemo2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int sum = 0;
        sum= a+ ++b;
        System.out.println("a=" + a + ",b=" + b + ",sum=" + sum);
        sum = a+++b;
        System.out.println("a=" + a + ",b=" + b + ",sum=" + sum);
        int n = 10;
        int m = ~n;
        System.out.println(m);
        int h = -n;
        System.out.println(h);
    }
}
