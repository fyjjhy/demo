package design_patterns.chain;

/**
 * <Description> 具体处理者角色<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.chain <br>
 * @since V1.0 <br>
 */
public class ConcreteHandler extends Handler {
    /**
     * Description: 处理方法，调用此方法处理请求<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param 
     * @return <br>
     */
    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }
        else {
            System.out.println("处理请求");
        }
    }
}
