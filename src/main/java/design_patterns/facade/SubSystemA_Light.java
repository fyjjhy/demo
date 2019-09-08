package design_patterns.facade;

/**
 * <Description> 灯类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.facade <br>
 * @since V1.0 <br>
 */
public class SubSystemA_Light {
    public void on() {
        System.out.println("打开了灯。。。");
    }

    public void off() {
        System.out.println("关闭了灯。。。");
    }
}
