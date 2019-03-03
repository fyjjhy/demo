package thread;

import javax.swing.*;
import java.awt.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月02日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestRunnable extends JFrame implements Runnable {

    /**
     * Description: 显示窗体、启动线程<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param args
     * @return <br>
     */
    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        testRunnable.setSize(500, 500);
        testRunnable.setVisible(true);
        testRunnable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread thread = new Thread(testRunnable);
        thread.start();
    }
    @Override
    public void run() {
        JPanel jPanel = new JPanel();
        this.setContentPane(jPanel);
        int i = 0;
        while (true) {
            i = i == 0 ? 1 : 0;
            if (i == 0) {
                jPanel.setBackground(Color.BLACK);
            }
            else {
                jPanel.setBackground(Color.WHITE);
            }
        }
    }
}
