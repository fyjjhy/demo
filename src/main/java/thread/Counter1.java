package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <Description> <br>
 * 考点：
 * 原子操作类是通过循环CAS的方式来保证其原子性
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月28日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class Counter1 {

    // 使用原子操作类
    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    //使用CountDownLatch来等待计算线程执行完
    static CountDownLatch countDownLatch = new CountDownLatch(30);

    public static void main(String[] args) throws InterruptedException {
        //开启30个线程进行累加操作
        for(int i=0;i<30;i++){
            new Thread(){
                public void run(){
                    for(int j=0;j<10000;j++){
                        atomicInteger.incrementAndGet();//原子性的num++,通过循环CAS方式
                    }
                    countDownLatch.countDown();
                }
            }.start();
        }
        //等待计算线程执行完
        countDownLatch.await();
        System.out.println(atomicInteger);
    }
}
