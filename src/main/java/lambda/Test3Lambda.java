package lambda;

import javax.swing.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test3Lambda {
    public static void main(String[] args) {
        JButton button = new JButton("Submit");
        button.addActionListener((e) -> System.out.println("Click event triggered"));

    }
}
