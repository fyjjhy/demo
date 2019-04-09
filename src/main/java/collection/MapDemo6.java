package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <Description> <br>
 * 【链接地址】
 * https://www.cnblogs.com/meieiem/archive/2011/11/02/2233041.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月09日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class MapDemo6 {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 1000; i++) {
            hashMap.put(String.valueOf(i), "thanks");
        }
        long bs = System.currentTimeMillis();
        Iterator iterator1 = hashMap.keySet().iterator();
        while (iterator1.hasNext()) {
            System.out.println(hashMap.get(iterator1.next()));
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - bs);
        listHashMap();
    }

    public static void listHashMap() {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 1000; i++) {
            hashMap.put(String.valueOf(i), "thanks");
        }
        long bs = System.currentTimeMillis();
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - bs);
    }

    /*对于keySet其实是遍历了两次，一次是转为Iterator，一次从hashMap中取出key所对应的value。
    * 而entrySet只遍历了一次，把key和value都放到了entry中
    * hashMap.get()是一个循环过程
    * iterator.next()需要一直执行到没有东西为止，也是一个循环过程*/
}
