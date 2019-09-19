package design_patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.visitor <br>
 * @since V1.0 <br>
 */
public class ObjectStructure {

    private List<Node> nodes = new ArrayList<>();

    public void action(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    /**
     * Description: 添加一个元素<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param node
     * @return <br>
     */
    public void add(Node node) {
        nodes.add(node);
    }
}
