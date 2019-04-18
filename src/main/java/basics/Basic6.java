package basics;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月16日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class Basic6 {

    public static void main(String[] args) {
        System.out.println(sum(1, 4, 5));
        System.out.println(sum(1, 4, 5, 20));
        System.out.println(sum());
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
