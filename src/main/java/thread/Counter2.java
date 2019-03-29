package thread;

/**
 * <Description> 【竞态条件与临界区】<br>
 * JVM并不是将这段代码视为单条指令来执行的，而是按照下面的顺序：
 * 1.从内存中获取this.count的值存到寄存器
 * 2.将寄存器中的值增加value
 * 3.将寄存器中的值写回内存
 * 【静态条件】:两个线程竞争同一资源，对资源的执行顺序敏感，称存在竞态条件。
 * 【临界区】:导致竞态条件发生的代码区称作临界区
 * 在临界区中使用适当的同步就可以避免静态条件
 * 竞态条件不总是会产生问题，还需要不恰当的执行时序
 * 为了保护临界区，可使用互斥量、读写锁等同步措施，保证同一时间
 * 只有一个线程能够进入临界区，或者同一时间只有一个写线程进入临界区，从而避免产生竞态条件
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月29日 <br>
 * @see thread <br>
 * @since 1.http://www.cnblogs.com/xiaolovewei/p/9081842.html
 *
 */
public class Counter2 {

    protected long count = 0;

    public void add(long value) {
        this.count += value;
    }
}
