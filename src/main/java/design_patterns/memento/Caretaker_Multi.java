package design_patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 负责人角色<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Caretaker_Multi {

    private Originator_Multi originator;

    private List<Memento_Multi> mementos = new ArrayList<>();

    private int current;

    public Caretaker_Multi(Originator_Multi originator) {
        this.originator = originator;
    }

    // 创建一个新的检查点
    public int createMemento() {
        Memento_Multi memento = originator.createMemento();
        mementos.add(memento);
        return current++;
    }

    // 将发起人恢复到某个检查点
    public void restoreMemento(int index) {
        Memento_Multi memento = mementos.get(index);
        originator.restoreMemento(memento);
    }

    // 删除某个检查点
    public void removeMemento(int index) {
        mementos.remove(index);
    }
}
