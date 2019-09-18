package design_patterns.state;

/**
 * <Description> 环境角色类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public class Context {

    // 持有一个State类型的对象实例
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    // 用户感兴趣的方法
    public void request(String sampleParameter) {
        // 转调state来处理
        state.handle(sampleParameter);
    }
}
