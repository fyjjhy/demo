package collection;

import entity.Dog;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <Description> LinkedHashMap<br>
 * 【特性】
 * 保存了插入顺序
 * 【链接地址】
 * https://www.cnblogs.com/chenpi/p/5505705.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class MapDemo3 {

    public static void main(String[] args) {
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");
        LinkedHashMap<Dog, Integer> linkedHashMap = new LinkedHashMap<Dog, Integer>();
        linkedHashMap.put(d1, 10);
        linkedHashMap.put(d2, 15);
        linkedHashMap.put(d3, 5);
        linkedHashMap.put(d4, 20);
        for (Map.Entry<Dog, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
