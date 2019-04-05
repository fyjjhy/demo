package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <Description> Iterator接口<br>
 * 【输出原理】
 * 是迭代输出接口，所谓的迭代输出就是将元素一个一个判断，判断其是否有内容，如果有内容，则将内容取出。
 * 【功能】
 * 由前向后单向输出。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月05日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class IteratorDemo1 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("_");
        stringList.add("world");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
