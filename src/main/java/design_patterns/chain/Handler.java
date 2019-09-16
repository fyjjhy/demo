package design_patterns.chain;

/**
 * <Description> 抽象处理者模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.chain <br>
 * @since V1.0 <br>
 */
public abstract class Handler {

    /** 持有后继的责任对象 */
    protected Handler successor;

    /** 示意处理请求的方法，虽然这个示意方法是没有传入参数的，但实际是可以传入参数的，根据具体需要来选择是否传入参数 */
    public abstract void handleRequest();

    /** 取值方法 */
    public Handler getSuccessor() {
        return successor;
    }

    /** 赋值方法，设置后继的责任对象 */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
