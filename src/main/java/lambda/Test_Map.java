package lambda;

import java.util.Arrays;
import java.util.List;
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
public class Test_Map {
    public static void main(String[] args) {
        // 将字符串转换成大写并用逗号链接起来
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(G7Countries);
    }
}
