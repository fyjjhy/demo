package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> reserve(反转集合中元素的顺序)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Reverse {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four five".split(" "));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
