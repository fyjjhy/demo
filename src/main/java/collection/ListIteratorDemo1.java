package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * <Description> ListIterator接口<br>
 * 【功能】
 * 实现由后向前输出或者是由前向后双向输出。
 * 【注意】
 * 一定要先进行由前向后输出，之后才能进行由后向前输出。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月05日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class ListIteratorDemo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("_");
        list.add("world");
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("由前向后输出：");
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            System.out.print(str + "、");
        }
        System.out.println("\n由后向前输出：");
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.print(str + "、");
        }
    }
}
