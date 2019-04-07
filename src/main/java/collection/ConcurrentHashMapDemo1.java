package collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <Description> ConcurrentHashMap<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class ConcurrentHashMapDemo1 {

    public static void main(String[] args) {
        // 定义全局ConcurrentHashMap
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(0, 0);
        for (int i = 0; i < 100; i++) {
            new Thread(new EditThread(concurrentHashMap)).start();
        }

        new Thread(new ReadThread(concurrentHashMap)).start();
        System.out.println("最终结果:" + concurrentHashMap.get(0));
    }

    public static class EditThread implements Runnable {
        Map<Integer, Integer> hashMap;

        public EditThread(Map<Integer, Integer> hashMap) {
            this.hashMap = hashMap;
        }

        @Override
        public void run() {
            hashMap.put(0, hashMap.get(0) + 1);
        }
    }

    public static class ReadThread implements Runnable {

        Map<Integer, Integer> hashMap;

        public ReadThread(Map<Integer, Integer> hashMap) {
            this.hashMap = hashMap;
        }

        @Override
        public void run() {
            System.out.println("value:" + hashMap.get(0));
        }
    }
}
