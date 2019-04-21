package random;

import java.util.Random;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月21日 <br>
 * @see random <br>
 * @since V1.0 <br>
 */
public class RandomDemo1 {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int random = RANDOM.nextInt(30);
        System.out.println(random);
    }
}
