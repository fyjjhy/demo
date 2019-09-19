package design_patterns.visitor;

/**
 * <Description> 具体节点类NodeA<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.visitor <br>
 * @since V1.0 <br>
 */
public class NodeA extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "NodeA";
    }
}
