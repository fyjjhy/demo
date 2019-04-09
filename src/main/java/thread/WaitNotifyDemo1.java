package thread;

import java.util.LinkedList;
import java.util.Queue;

import entity.Consumer;
import entity.Producer;

/**
 * <Description> wait-notify<br>
 * 【注意事项】
 * 1.永远在synchronized的函数或对象里使用wait、notify和notifyAll，不然java虚拟机会生成IllegalMonitorStateException
 * 2.永远在while循环里而不是if语句下使用wait。这样，循环会在线程睡眠前后都检查wait的条件，并在条件实际上并未
 * 改变的情况下处理唤醒通知。
 * 3.永远在多线程间共享的对象上使用wait。
 * 4.notify随机通知一个阻塞在对象上的线程，notifyAll通知阻塞在对象上的所有线程。
 * 【链接地址】
 * https://blog.csdn.net/leel0330/article/details/80455307
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/9
 * @see thread <br>
 * @since V1.0<br>
 */
public class WaitNotifyDemo1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		int maxSize = 10;
		Producer producer = new Producer(queue, maxSize);
		Consumer consumer = new Consumer(queue, maxSize);
		Thread pt = new Thread(producer);
		Thread ct = new Thread(consumer);
		pt.start();
		ct.start();
	}
}
