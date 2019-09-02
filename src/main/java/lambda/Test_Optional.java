package lambda;

import java.util.Optional;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test_Optional {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(5);
        System.out.println(o1.isPresent());
        System.out.println(o1.get());

        Optional<Integer> o2 = Optional.empty();
        System.out.println(o2.isPresent());
    }
}
