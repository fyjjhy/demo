package design_patterns.state;

/**
 * <Description> 客户端类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public class Client {

    public static void main(String[] args) {
        // 创建状态
        State state = new ConcreteStateB();
        // 创建环境
        Context context = new Context();
        // 将状态设置到环境中
        context.setState(state);
        // 请求
        context.request("text");
    }
}
