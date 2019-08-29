package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> swap(交换集合中指定元素索引m,n的位置)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Swap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four five".split(" "));
        Collections.swap(list, 2, 3);
        System.out.println(list);
    }
}
