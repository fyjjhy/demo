package design_patterns;

/**
 * <Description> 普通工厂模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new Test_Factory_MailSender();
        } else if ("sms".equals(type)) {
            return new Test_Factory_SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
