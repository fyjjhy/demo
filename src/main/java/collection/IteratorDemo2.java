package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <Description> Iterator接口<br>
 * 【方法】
 * remove():删除当前对象
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月05日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class IteratorDemo2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("_");
        list.add("world");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if ("_".equals(str)) {
                iterator.remove();
            }
            else {
                System.out.println(str);
            }
        }
        System.out.println("删除指定元素后的集合：" + list);
    }
}
