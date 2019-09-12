package design_patterns.composite;

/**
 * <Description> 组合部件类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月11日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public class Leaf extends Component {
    // 叶子节点不具备添加能力，所以不实现
    @Override
    public void add(Component c) {
        System.out.println("");
    }

    // 叶子节点不具备添加能力必然也不能删除
    @Override
    public void remove(Component c) {
        System.out.println("");
    }

    // 叶子节点没有子节点所以显示自己的执行结果
    @Override
    public void eachChild() {
        System.out.println(name + "执行了");
    }
}
