package thread;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <Description> volatile<br>
 * 考点：当状态为true时，执行run()
 * 在单线程模型中，先改变状态再执行run()方法，自然可以正确输出"running..."
 * 在多线程模型中，不能保证输出，因为对于共享变量status来说，线程A的修改对于线程B来说，是不可见的。
 * 也就是说，线程B此时可能无法观察到status已被修改为true
 * 关键词：
 * 1. 可见性
 * volatile修饰变量，保证可见性，并不保证原子性。
 * volatile关键字保证其线程间的可见性。
 * volatile是轻量级的synchronized，在多处理器的开发中保证了共享变量的可见性。
 * 当一个线程修改一个共享变量时，另一个线程能够读取到这个修改值。
 * 可见性指一个线程修改了共享变量的值，新值对于其他线程来说是可以立即得知的。
 * volatile的两种特性：
 * 1.当写一个volatile变量时，JMM会把该线程对应的本地内存中的变量强制刷新到主内存中去
 * 2.这个写操作会导致其他线程中的缓存无效
 * 3.禁止指令重排序优化
 * 重排序是指编译器和处理器为了优化程序性能而对执行序列进行排序的一种手段。但是重排序也需要遵守一定的规则：
 * 3.1重排序操作不会对存在数据依赖关系的操作进行重排序。
 * 3.2重排序是为了优化性能，但是不管怎么重排序，单线程下程序的执行结果不能被改变
 * volatile修饰共享变量，在编译时，会在指令序列中插入内存屏障来禁止特定类型的处理器重排序
 * volatile禁止指令重排序规则：
 * 1.当第二个操作是volatile写时，无论第一个操作是什么，都不能进行重排序
 * 2.当第一个操作是volatile读时，不管第二个操作是什么，都不能进行重排序
 * 3.当第一个操作是volatile写时，第二个操作是volatile读时，不能进行重排序
 * 总结：
 * volatile是一种轻量级的同步机制，它主要有两个特性：
 * 一是保证共享变量对所有线程的可见性；二是禁止指令重排序优化。
 * volatile对于单个共享变量的读/写具有原子性，但是像num++这种复合操作，
 * volatile无法保证其原子性，可以使用并发包中的原子操作类，通过循环CAS的方式来保证
 * num++操作的原子性。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月28日 <br>
 * @see thread <br>
 * @since https://www.cnblogs.com/chengxiao/p/6528109.html <br>
 */
public class TestVolatile {

    public static void main(String[] args) {
        TestVolatile testVolatile = new TestVolatile();
        Foo foo = testVolatile.new Foo();
        foo.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "运行，此时的状态是：" + foo.isStatus());
                while (true) {
                    if (foo.isStatus()) {
                        System.out.println("what???");
                        foo.change();
                    }
                }
            }
        }, "t2").start();
    }

    class Foo extends Thread {
        volatile private boolean status = false;

        public void change() {
            status = !status;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "运行，此时的状态是：" + isStatus());
            JFrame frame = new JFrame("Volatile Demo");
            frame.setSize(800, 600);
            frame.setLocation(300, 100);
            JPanel jPanel = new JPanel();
            jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            jPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            JButton jButton = new JButton("Change");
            jButton.setSize(100, 50);
            jButton.setFont(new Font("Consolas", Font.BOLD, 20));
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Foo.this.setStatus(true);
                }
            });
            jPanel.add(jButton);
            frame.setContentPane(jPanel);
            frame.setVisible(true);
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    }
}
