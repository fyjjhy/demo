package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> sort(根据元素的自然顺序对指定集合按升序进行排序)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Sort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four five".split(" "));
        Collections.sort(list);
        System.out.println(list);
    }
}
