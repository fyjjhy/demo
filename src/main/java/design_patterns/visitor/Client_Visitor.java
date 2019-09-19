package design_patterns.visitor;

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
public class Client_Visitor {

    public static void main(String[] args) {
        // 创建一个结构对象
        ObjectStructure structure = new ObjectStructure();
        // 给结构增加一个节点
        structure.add(new NodeA());
        // 给结构增加一个节点
        structure.add(new NodeB());
        // 创建一个访问者
        Visitor visitor = new VisitorA();
        structure.action(visitor);
    }
}
