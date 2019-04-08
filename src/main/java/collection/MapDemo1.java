package collection;

import entity.Dog;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> HashMap<br>
 * 【链接地址】
 * https://www.cnblogs.com/acm-bingzi/p/javaMap.html
 * https://www.cnblogs.com/chenpi/p/5505705.html
 * 【实现】
 * 基于散列表实现
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class MapDemo1 {

    public static void main(String[] args) {
        HashMap<Dog, Integer> hashMap = new HashMap<>();
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");
        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);
        hashMap.put(d4, 20);
        System.out.println(hashMap.size());
        for (Map.Entry<Dog, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + "-" + entry.getValue());
        }
    }
}
