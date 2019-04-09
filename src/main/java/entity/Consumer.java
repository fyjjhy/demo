package entity;

import java.util.Queue;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/9
 * @see entity <br>
 * @since V1.0<br>
 */
@Setter
@Getter
public class Consumer extends AbstractVo implements Runnable {

	private Queue<Integer> queue;
	private int maxSize;

	public Consumer(Queue<Integer> queue, int maxSize) {
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					System.out.println("queue is empty");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int v = queue.remove();
				System.out.println("consume" + v);
				queue.notifyAll();
			}
		}
	}
}
