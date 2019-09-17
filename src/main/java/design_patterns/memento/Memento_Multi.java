package design_patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 备忘录角色类，这个实现可以存储任意多的状态，外界可以使用检查点指数index来取出检查点上的状态。<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Memento_Multi {

    private List<String> states;

    private int index;

    public Memento_Multi(List<String> states, int index) {
        this.states = new ArrayList<String>(states);
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public int getIndex() {
        return index;
    }
}
