package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> shuffle(随机排序集合)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Shuffle {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four five".split(" "));
        Collections.shuffle(list);
        System.out.println(list);
    }
}
