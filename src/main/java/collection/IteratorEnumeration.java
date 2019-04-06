package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;

/**
 * <Description> 测试分别通过 Iterator 和 Enumeration 去遍历Hashtable<br>
 * 【链接】
 * https://www.cnblogs.com/skywang12345/p/3311275.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月06日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class IteratorEnumeration {

    public static void main(String[] args) {
        int val;
        Random random = new Random();
        Hashtable table = new Hashtable();
        for (int i = 0; i < 100000; i++) {
            // 随机取一个(0, 100)之间的数字
            val = random.nextInt(100);
            table.put(String.valueOf(i), val);
        }

        // 通过Iterator遍历
        iteratorHashtable(table);
        // 通过Enumeration遍历
        enumHashtable(table);
    }

    private static void iteratorHashtable(Hashtable hashtable) {
        long startTime = System.currentTimeMillis();
        Iterator iterator = hashtable.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        countTime(endTime, startTime);
    }

    private static void enumHashtable(Hashtable hashtable) {
        long startTime = System.currentTimeMillis();
        Enumeration enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
        }
        long endTime = System.currentTimeMillis();
        countTime(endTime, startTime);
    }

    private static void countTime(long endTime, long startTime) {
        System.out.println("time：" + (endTime - startTime) + "ms");
    }
}
