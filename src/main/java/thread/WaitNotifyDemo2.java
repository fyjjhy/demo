package thread;

import entity.Consumer2;
import entity.Producer2;
import entity.Storage;

/**
 * <Description> wait-notify<br>
 * 【描述】
 * 有一块缓冲区作为仓库，生产者可以将产品放入仓库，消费者可以从仓库中取走产品。
 * 【解决生产者消费者问题】
 * 1.采用某种机制保护生产者和消费者之间的同步。
 * 2.在生产者和消费者之间建立一个管道。
 * 【同步问题的核心】
 * 如何保证统一资源被多个线程并发访问时的完整性。
 * 【常用方式】
 * 1.信号
 * 2.锁机制
 * 【同步方法】
 * 1.wait()/notify()方法
 * 2.await()/signal()方法
 * 3.BlockingQueue阻塞队列方法
 * 4.PipedInputStream/PipedOutputStream
 * 【wait/notify】
 * wait()/notify()方法是基类Object的两个方法，也就意味着所有的java类都会拥有这两个方法，这样，
 * 就可以为任何对象实现同步机制。
 * wait():当缓冲区已满/空时，生产者/消费者线程停止自己的执行，放弃锁，使自己处于等待状态，让其他线程执行。
 * notify():当生产者/消费者向缓冲区放入/取出一个产品时，向其他等待的线程发出可执行的通知，同时放弃锁，使自己处于等待状态。
 * 【链接地址】
 * https://www.cnblogs.com/Kevin-mao/p/5950743.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/9
 * @see thread <br>
 * @since V1.0<br>
 */
public class WaitNotifyDemo2 {

	public static void main(String[] args) {
		// 仓库对象
		Storage storage = new Storage();

		// 生产者对象
		Producer2 p1 = new Producer2(storage);
		Producer2 p2 = new Producer2(storage);
		Producer2 p3 = new Producer2(storage);
		Producer2 p4 = new Producer2(storage);
		Producer2 p5 = new Producer2(storage);
		Producer2 p6 = new Producer2(storage);
		Producer2 p7 = new Producer2(storage);

		// 消费者对象
		Consumer2 c1 = new Consumer2(storage);
		Consumer2 c2 = new Consumer2(storage);
		Consumer2 c3 = new Consumer2(storage);

		// 设置生产者产品生产数量
		p1.setNum(10);
		p2.setNum(10);
		p3.setNum(10);
		p4.setNum(10);
		p5.setNum(10);
		p6.setNum(10);
		p7.setNum(80);

		// 设置消费者产品消费数量
		c1.setNum(50);
		c2.setNum(20);
		c3.setNum(30);

		// 线程开始执行
		Thread pt1 = new Thread(p1);
		Thread pt2 = new Thread(p2);
		Thread pt3 = new Thread(p3);
		Thread pt4 = new Thread(p4);
		Thread pt5 = new Thread(p5);
		Thread pt6 = new Thread(p6);
		Thread pt7 = new Thread(p7);

		Thread ct1 = new Thread(c1);
		Thread ct2 = new Thread(c2);
		Thread ct3 = new Thread(c3);

		ct1.start();
		ct2.start();
		ct3.start();

		pt1.start();
		pt2.start();
		pt3.start();
		pt4.start();
		pt5.start();
		pt6.start();
		pt7.start();

	}
}
