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
public class Test_Filter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "bcd", "defg", "jk");
        Predicate<String> strLen = (x) -> x.length() > 2;
        List<String> filtered = list.stream().filter(strLen).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", list, filtered);
    }
}
