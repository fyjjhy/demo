package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <Description> 测试tryLock()的使用方法<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月06日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestTryLock {

    private List<Integer> list = new ArrayList<>();

    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final TestTryLock testTryLock = new TestTryLock();

        new Thread() {
            @Override
            public void run() {
                testTryLock.insert(Thread.currentThread());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                testTryLock.insert(Thread.currentThread());
            }
        }.start();
    }

    private void insert(Thread thread) {
        if (lock.tryLock()) {
            System.out.println(thread.getName() + "得到了锁");
            try {
                for (int i = 0; i < 5; i++) {
                    list.add(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println(thread.getName() + "释放了锁");
                lock.unlock();
            }
        }
        else {
            System.out.println(thread.getName() + "获取锁失败!");
        }
    }
}
