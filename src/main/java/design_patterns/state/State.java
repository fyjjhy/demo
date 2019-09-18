package design_patterns.state;

/**
 * <Description> 抽象状态类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public interface State {

    // 状态对应的处理
    public void handle(String sampleParameter);
}
