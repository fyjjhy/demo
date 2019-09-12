package design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 组合类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月11日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public class Composite extends Component {
    // 用来保存节点的子节点
    List<Component> list = new ArrayList<>();

    // 添加节点，添加部件
    @Override
    public void add(Component c) {
        list.add(c);
    }

    // 删除节点，删除部件
    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    // 遍历子节点
    @Override
    public void eachChild() {
        System.out.println(name + "执行了");
        for (Component c: list
                ) {
            c.eachChild();
        }
    }
}
