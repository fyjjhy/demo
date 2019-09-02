package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <Description> 方法引用的形式<br>
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
        // 引用静态方法
        List<Integer> integers = Arrays.asList(1, 2, 3, 5);
        Optional<Integer> max = integers.stream().reduce(Math::max);
        max.ifPresent(value -> System.out.println(value));

        // 通过实例引用实例方法
        max.ifPresent(System.out::println);

        // 通过类引用实例方法
        List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
        List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(sorted);

        List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortedAlt);

        // 引用构造函数
        List<Integer> integerList = IntStream.range(1, 100).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(integerList);

        Optional<Integer> optional = integerList.stream().reduce(Math::max);
        optional.ifPresent(System.out::println);
    }
}
