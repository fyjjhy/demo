package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <Description> 多线程并发访问集合时的线程安全问题<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月30日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Synchronized {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one two three four five".split(" "));
        List<String> list2 = Collections.synchronizedList(list1);
        System.out.println(list2);
    }
}
