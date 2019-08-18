package finalClass;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月16日 <br>
 * @see finalClass <br>
 * @since V1.0 <br>
 */
public class FinalDemo01 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        FinalClass1 finalClass = new FinalClass1(array);
        array[0] = 2;
        System.out.println(Arrays.toString(array));
        int[] arr = finalClass.getMyArray();
        System.out.println(Arrays.toString(arr));
    }
}
