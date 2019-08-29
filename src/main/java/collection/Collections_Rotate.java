package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> rotate(集合中的元素向后移m个位置，在后面被遮盖的元素循环到前面来)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Rotate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four five".split(" "));
        Collections.rotate(list, 2);
        System.out.println(list);
    }
}
