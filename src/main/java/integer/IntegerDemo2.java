package integer;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月21日 <br>
 * @see integer <br>
 * @since V1.0 <br>
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        IntegerDemo2 demo2 = new IntegerDemo2();
        System.out.println(demo2.foo(5));
    }

    int foo(int n) {
        if (n < 2) return n;
        return foo(n - 1) + foo(n - 2);
    }
}
