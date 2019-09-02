package lambda;

import java.util.Optional;

/**
 * <Description> 返回Optional<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test3_Optional {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty();
        // 检查Optional, 如果有值直接返回，否则返回new Integer(5)
        Integer integer = o1.orElse(new Integer(5));
        System.out.println(integer);
        // 检查Optional, 如果有值直接返回，否则返回抛出异常
        o1.orElseThrow(IllegalStateException::new);
    }
}
