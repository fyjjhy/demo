package lambda;

import java.util.Optional;

/**
 * <Description> 创建Optional对象<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test1_Optional {
    public static void main(String[] args) {
        // 1.使用Optional.empty()创建一个空的Optional
        Optional<Integer> o1 = Optional.empty();
        System.out.println(o1);

        // 2.使用Optional.of()创建一个非null的值
        Optional<Integer> o2 = Optional.of(5);
        System.out.println(o2);

        // 使用Optional.ofNullable()创建一个可以包含空值的Optional对象，如果参数是null，则返回一个空的Optional
        Optional<Integer> o3 = Optional.ofNullable(null);
        System.out.println(o3);

        Optional<Integer> o4 = Optional.ofNullable(5);
        System.out.println(o4);
    }
}
