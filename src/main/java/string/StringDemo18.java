package string;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月21日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo18 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }

    public static void operator(StringBuffer a, StringBuffer b) {
        a.append(b);
        System.out.println(a.toString());
        b = a;
        System.out.println(b);
    }
}
