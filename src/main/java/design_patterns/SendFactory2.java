package design_patterns;

/**
 * <Description> 多个工厂方法模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class SendFactory2 {
    public Sender produceMail() {
        return new Test_Factory_MailSender();
    }

    public Sender productSms() {
        return new Test_Factory_SmsSender();
    }

    public static void main(String[] args) {
        SendFactory2 sendFactory2 = new SendFactory2();
        Sender sender = sendFactory2.produceMail();
        sender.send();
    }
}
