package thread;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <Description> ThreadLocalRandom 产生并发随机数<br>
 *【使用ThreadLocalRandom好处】
 * 1.不再有从多个线程访问同一个随机数生成器实例的争夺。
 * 2.取代以前每个随机变量实例化一个随机数生成器实例，我们可以每个线程实例化一个。
 *【性能提升】
 * 通过将线程安全放入其初始化部分，而不是在使用阶段，这就能够得到性能提升。
 *【其他】
 * ThreadLocal与synchronized，synchronized是在代码使用时加上同步，
 * 而使用ThreadLocal是每个线程一个实例，避免使用共享要引入同步。
 *【链接地址】
 * https://blog.csdn.net/kuyuyingzi/article/details/41855605
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class ThreadLocalRandomDemo1 {

    public static void main(String[] args) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        System.out.println(threadLocalRandom.nextInt(10, 50));
    }
}
