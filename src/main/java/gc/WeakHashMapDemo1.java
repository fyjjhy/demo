package gc;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * <Description> WeakHashMap<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月11日 <br>
 * @see gc <br>
 * @since V1.0 <br>
 */
public class WeakHashMapDemo1 {

    public static void main(String[] args) throws InterruptedException {
        Map<Object, Object> weakHashMap = new WeakHashMap<>();
        Object key = new Object();
        Object value = new Object();
        weakHashMap.put(key, value);
        System.out.println(weakHashMap.containsValue(value));
        key = null;
        System.gc();
        System.out.println(key);
        // 等待无效entries进入ReferenceQueue以便下一次调用getTable时被清理
        Thread.sleep(1000);
        // 一旦没有指向key的强引用，WeakHashMap在GC后将自动删除相关的entry
        System.out.println(weakHashMap.containsValue(value));
    }
}
