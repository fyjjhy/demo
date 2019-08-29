package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> copy(将后一个集合的元素全部复制到前一个集合中，并且覆盖相应索引的元素)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Copy {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one two three four five six".split(" "));
        List<String> list2 = Arrays.asList("一 二 三 四 五".split(" "));
        Collections.copy(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
