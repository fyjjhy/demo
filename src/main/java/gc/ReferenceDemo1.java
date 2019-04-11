package gc;

/**
 * <Description> 强引用、软引用、弱引用、幽灵引用<br>
 * 【4种引用】
 * StrongReference:java默认引用实现，它会尽可能长时间的存活于JVM内，当没有任何对象指向它时，GC执行后将会被回收
 * SoftReference
 * WeakReference
 * PhantomReference
 * 【链接地址】
 * https://san-yun.iteye.com/blog/1683558
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月11日 <br>
 * @see gc <br>
 * @since V1.0 <br>
 */
public class ReferenceDemo1 {

    public static void main(String[] args) {
        Object reference = new Object();
        System.out.println(reference);

        // 通过赋值创建StrongReference
        Object strongReference = reference;

        reference = null;
        System.gc();
        System.out.println(reference);

        // StrongReference在GC后不会被回收
        System.out.println(strongReference);
    }

}
