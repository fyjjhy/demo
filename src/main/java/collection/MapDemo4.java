package collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * <Description> HashMap<br>
 * 【实现】
 * jdk8之前，其内部是由数组+链表实现的；
 * jdk8对于链表长度超过8的链表将转储为红黑树。
 * 【底层】
 * HashMap的底层就是一个数组结构，数组中的每一项又是一个链表。
 * 【初始化】
 * 当新建一个HashMap的时候，就会初始化一个数组。
 * 【图片链接地址】
 * D:\临时文件存放位置\java_\collections\HashMap-put元素.png
 * 【容量】
 * 2的n次方
 * 【碰撞】
 * hash碰撞指：对象拥有相同的hashCode，但是对象不同，其概率为数学问题
 * 【红黑树】
 * 红黑树本质上是一种二叉查找树，但它在二叉查找树的基础上额外添加了一个标记(颜色)，
 * 同时具有一定的规则。这些规则使红黑树保证了一种平衡，插入、删除、查找的最坏时间复杂度都为O(logn)。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月09日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class MapDemo4 {

    public static void main(String[] args) {
        // HashMap遍历删除
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(String.valueOf(i), i);
        }

        for (Iterator iterator = hashMap.entrySet().iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println("map的大小=" + hashMap.size());
        }

        hashMap.keySet().forEach(key -> {
            if ("3".equals(key)) {
                hashMap.remove(key);
            }
        });
        System.out.println("map的大小=" + hashMap.size());
    }
}
