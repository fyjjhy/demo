package design_patterns;

/**
 * <Description> 静态工厂方法模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class SendFactory3 {
    public static Sender produceMail() {
        return new Test_Factory_MailSender();
    }

    public static Sender produceSms() {
        return new Test_Factory_SmsSender();
    }

    public static void main(String[] args) {
        Sender sender = SendFactory3.produceMail();
        sender.send();
    }
}
