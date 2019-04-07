package collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * <Description> ConcurrentHashMap<br>
 *【链接地址】
 * https://blog.csdn.net/xuefeng0707/article/details/40834595
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class ConcurrentHashMapDemo3 {

    private static ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        new Thread("Thread1") {
            @Override
            public void run() {
                concurrentHashMap.put(3, 33);
            }
        }.start();

        new Thread("Thread2") {
            @Override
            public void run() {
                concurrentHashMap.put(4, 44);
            }
        }.start();

        new Thread("Thread3") {
            @Override
            public void run() {
                concurrentHashMap.put(7, 77);
            }
        }.start();

        TimeUnit.SECONDS.sleep(3);

        System.out.println(concurrentHashMap);
    }

}
