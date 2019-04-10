package thread;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/10
 * @see thread <br>
 * @since V1.0<br>
 */
public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static class MyRunnable implements Runnable {
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
		int local = 0;
		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 100D));
			local = (int) (Math.random() * 100D);
			try {
				System.out.println("当前线程"+Thread.currentThread().getName()+"正在执行");
				Thread.sleep(3000);
				System.out.println("当前线程"+Thread.currentThread().getName()+"执行完毕!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("threadLocal:"+threadLocal.get());
			System.out.println("local:"+local);
		}
	}
}
