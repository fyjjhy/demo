package collection;

import entity.Dog;

import java.util.Map;
import java.util.TreeMap;

/**
 * <Description> TreeMap<br>
 * 【特性】
 * TreeMap是按key排序的
 * 【实现】
 * 基于红黑树实现的
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class MapDemo2 {

    public static void main(String[] args) {
        Dog d1 = new Dog("red", 30);
        Dog d2 = new Dog("black", 20);
        Dog d3 = new Dog("white", 10);
        Dog d4 = new Dog("white", 40);
        TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
        treeMap.put(d1, 10);
        treeMap.put(d2, 15);
        treeMap.put(d3, 5);
        treeMap.put(d4, 20);

        for (Map.Entry<Dog, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
