package gc;

import java.lang.ref.SoftReference;

/**
 * <Description> 软引用<br>
 *SoftReference:于WeakReference的特性保持一致，最大的区别在于软引用会尽可能长的保留引用直到JVM
 * 内存不足时才会被回收(虚拟机保证)，这一特性使用SoftReference非常适合缓存应用
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月11日 <br>
 * @see gc <br>
 * @since V1.0 <br>
 */
public class ReferenceDemo3 {

    public static void main(String[] args) {
        Object reference = new Object();
        SoftReference<Object> softReference = new SoftReference<>(reference);
        System.out.println(softReference.get());
        reference = null;
        System.gc();
        System.out.println(reference);
        // 软引用只有在JVM OutOfMemory之前才会被回收，所以它非常适合缓存应用
        System.out.println(softReference.get());
    }
}
