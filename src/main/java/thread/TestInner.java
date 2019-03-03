package thread;

import javax.swing.*;
import java.awt.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class TestInner {

    public static void main(String[] args) {
        // 创建窗口对象
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        jPanel.setSize(300, 300);
        jFrame.setContentPane(jPanel);
        Thread thread = new Thread() {
            @Override
            public void run() {
                // 实现窗口的颜色在黑白之间切换
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
        };
        thread.start();
    }
}
