package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> indexOfSublist(返回指定源列表中第一次出现指定目录列表的起始位置)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_IndexOfSublist {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one two three four five".split(" "));
        List<String> subList = Arrays.asList("three four five".split(" "));
        System.out.println(Collections.indexOfSubList(list, subList));
    }
}
