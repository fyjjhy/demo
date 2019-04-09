package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <Description> HashMap的两种遍历方式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月09日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class MapDemo5 {

    public static void main(String[] args) {
        // 遍历方式1，效率高
        System.out.println("第一种遍历方式");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), i);
        }
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            int value = (int) entry.getValue();
            System.out.println(key + ":" + value);
        }

        System.out.println("第二种遍历方式");

        // 遍历方式2，效率低
        Map<String, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            integerMap.put(String.valueOf(i), i);
        }
        Iterator iter = integerMap.keySet().iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            int value = integerMap.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
