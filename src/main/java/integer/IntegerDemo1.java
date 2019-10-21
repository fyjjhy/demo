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
public class IntegerDemo1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        do {
            y--;
            ++x;
        } while (x < 6);
        System.out.println(x + "," + y);
    }
}
