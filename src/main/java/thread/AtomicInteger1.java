package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <Description> 原子更新整形<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月28日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class AtomicInteger1 {

    private static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.getAndSet(5));
        System.out.println(atomicInteger.get());
    }
}
