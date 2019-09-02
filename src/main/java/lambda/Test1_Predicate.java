package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
public class Test1_Predicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Japan", "Jjjj", "China", "abcd");
        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
        List<String> names = list.stream().filter(startsWithJ.or(fourLetterLong)).collect(Collectors.toList());
        System.out.println(names);
    }
}
