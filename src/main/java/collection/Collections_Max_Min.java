package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <Description> 根据指定比较器产生的顺序，返回给定Collection中最大(小)元素<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Collections_Max_Min {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
