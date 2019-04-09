package entity;

import java.util.Queue;
import java.util.Random;

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
@Getter
@Setter
public class Producer extends AbstractVo implements Runnable {
	private Queue<Integer> queue;
	private int maxSize;

	public Producer(Queue<Integer> queue, int maxSize) {
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == maxSize) {
					System.out.println("queue is full");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Random random = new Random();
				int i = random.nextInt();
				System.out.println("product" + i);
				queue.add(i);
				queue.notifyAll();
			}
		}
	}
}
