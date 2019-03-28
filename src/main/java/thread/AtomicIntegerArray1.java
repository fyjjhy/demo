package thread;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * <Description> 原子更新数组<br>
 * 数组value通过构造方法传递进去，然后AtomicIntegerArray会将当前数组复制一份，
 *  所以当AtomicIntegerArray对内部的数组元素进行修改时，不会影响传入的数组
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月28日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class AtomicIntegerArray1 {

    private static int[] value = new int[]{1, 2, 3};

    private static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        atomicIntegerArray.getAndSet(0, 12);
        System.out.println(atomicIntegerArray.get(0));
        System.out.println(value[0]);
    }
}
