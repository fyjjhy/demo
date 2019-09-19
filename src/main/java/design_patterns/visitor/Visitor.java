package design_patterns.visitor;

/**
 * <Description> 抽象访问者角色<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.visitor <br>
 * @since V1.0 <br>
 */
public interface Visitor {

    // 对应于NodeA的访问操作
    public void visit(NodeA node);

    // 对应于NodeB的访问操作
    public void visit(NodeB node);

}
