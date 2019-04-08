package basics.operator;

/**
 * <Description> 算术运算符(二元运算符)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see basics.operator <br>
 * @since V1.0 <br>
 */
public class OperatorDemo3 {

    public static void main(String[] args) {
        int a = 22;
        int b = 5;
        double c = 5;
        System.out.println(b + "+" + c + "=" + (b + c));
        System.out.println(b + "-" + c + "=" + (b - c));
        System.out.println(b + "*" + c + "=" + (b * c));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + "%" + b + "=" + (a % b));
        System.out.println(a + "/" + c + "=" + (a / c));
        System.out.println(a + "%" + c + "=" + (a % c));
    }
}
