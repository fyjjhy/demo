package design_patterns;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class Test_Factory_MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
