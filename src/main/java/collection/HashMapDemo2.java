package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <Description> HashMap<br>
 * 【应用场景】
 * 1.单线程运行环境，并且不需要遍历操作的场景
 *【链接地址】
 * https://blog.csdn.net/sinbadfreedom/article/details/80467253
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class HashMapDemo2 {

    public static void main(String[] args) {
        // 定义全局HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            hashMap.put(i, i);
        }

        new Thread(new AddThread(hashMap)).start();
        new Thread(new RemoveThread(hashMap)).start();

        // 读取线程
        new Thread(new InteratorThread(hashMap)).start();
        // 最终结果
        System.out.println();
    }

    public static class AddThread implements Runnable {

        Map<Integer, Integer> hashMap;

        public AddThread(Map<Integer, Integer> hashMap) {
            this.hashMap = hashMap;
        }

        @Override
        public void run() {
            while (true) {
                int random = new Random().nextInt();
                hashMap.put(random, random);
            }
        }
    }

    public static class RemoveThread implements Runnable {

        Map<Integer, Integer> hashMap;

        public RemoveThread(Map<Integer, Integer> hashMap) {
            this.hashMap = hashMap;
        }

        @Override
        public void run() {
            int random = new Random().nextInt(1000);
            while (true) {
                hashMap.remove(random);
            }
        }
    }

    public static class InteratorThread implements Runnable {

        Map<Integer, Integer> hashMap;

        public InteratorThread(Map<Integer, Integer> hashMap) {
            this.hashMap = hashMap;
        }

        @Override
        public void run() {
            System.out.println("-----------------" + hashMap.size());
            for (Integer value : hashMap.values()) {
                System.out.println("value:" + value);
            }
            System.out.println("=================" + hashMap.size());
        }
    }
}
