package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> lastIndexOfSublist(返回指定列表中最后一次出现目录列表的起始位置)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_LastIndexOfSublist {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one two three four five".split(" "));
        List<String> list2 = Arrays.asList("four five".split(" "));
        System.out.println(Collections.lastIndexOfSubList(list1, list2));
    }
}
