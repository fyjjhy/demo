package lambda;

import java.util.Optional;

/**
 * <Description>  处理Optional的值<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test2_Optional {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(5);
        // 当得到一个Optional的值的时候，首先需要检测其是否包含了值
        o1.ifPresent(System.out::println);

        Optional<Integer> o2 = Optional.ofNullable(null);
        o2.ifPresent(System.out::println);
    }
}
