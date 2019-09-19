package design_patterns.visitor;

/**
 * <Description> 抽象节点类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.visitor <br>
 * @since V1.0 <br>
 */
public abstract class Node {

    // 接收操作
    public abstract void accept(Visitor visitor);

}
