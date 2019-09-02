package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * <Description> 引用静态方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class TestRefer {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 5);
        Optional<Integer> max = integers.stream().reduce(Math::max);
        max.ifPresent(value -> System.out.println(value));
    }
}
