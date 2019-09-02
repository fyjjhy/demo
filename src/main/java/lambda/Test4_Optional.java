package lambda;

import java.util.Optional;

/**
 * <Description> 在filter中使用Optional<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test4_Optional {
    public static void main(String[] args) {
        // Optional<String> o1 = Optional.empty();
        Optional<String> o1 = Optional.of("Finance");
        o1.filter(s -> "Finance".equals(s)).ifPresent(System.out::println);
    }
}
