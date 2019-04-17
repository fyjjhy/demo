package string;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月17日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo5 {

    public static void main(String[] args) {
        String str = "12.34";
        String[] res = str.split(".");
        System.out.println(Arrays.toString(res));

        String[] strs = str.split("\\.");
        System.out.println(Arrays.toString(strs));
    }
}
