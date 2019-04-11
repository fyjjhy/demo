package gc;

import java.lang.ref.WeakReference;

/**
 * <Description> 弱引用<br>
 *WeakReference:当弱引用的对象在JVM内不再有强引用时，GC后弱引用将会被自动回收
 * 【应用】
 * WeakHashMap使用WeakReference作为key，一旦没有指向key的强引用，WeakHashMap在GC后将自动删除相关的entry
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月11日 <br>
 * @see gc <br>
 * @since V1.0 <br>
 */
public class ReferenceDemo2 {

    public static void main(String[] args) {
        Object reference = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(reference);
        System.out.println(weakReference.get());
        reference = null;
        System.gc();
        System.out.println(reference);
        // 一旦没有指向reference的强引用，弱引用在GC后会被自动回收
        System.out.println(weakReference.get());
    }
}
