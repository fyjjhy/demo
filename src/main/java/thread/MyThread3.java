package thread;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月07日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class MyThread3 {

    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();
    final Object[] items = new Object[100];
    int putptr, takeptr, count;
    public void put(Object x) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length) {
                notFull.await();
            }
            items[putptr] = x;
            if (++putptr == items.length) {
                putptr = 0;
            }
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            Object x = items[takeptr];
            if (++takeptr ==items.length) {
                takeptr = 0;
            }
            --count;
            notFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        try {
            myThread3.put(20);
            for (int i = 0; i < myThread3.getItems().length; i++) {
                System.out.println("item[" + i + "]=" + myThread3.getItems()[i]);
                System.out.println("putptr[" + i + "]=" + myThread3.getPutptr());
                System.out.println("takeptr[" + i + "]=" + myThread3.getTakeptr());
                System.out.println("count[" + i + "]=" + myThread3.getCount());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
