package design_patterns.proxy;

/**
 * <Description> 客户端调用<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.proxy <br>
 * @since V1.0 <br>
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.buyMac();
    }
}
