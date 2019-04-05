package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <Description> List集合<br>
 * List接口本身存在删除方法：remove()
 * 如果在迭代的过程中使用List集合中的remove()方法执行删除操作，则代码将出现问题
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月05日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class IteratorDemo3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("_");
        list.add("world");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if ("_".equals(str)) {
                list.remove(str);
            }
            else {
                System.out.println(str);
            }
        }
        System.out.println("使用list集合删除元素后：" + list);
    }
}
