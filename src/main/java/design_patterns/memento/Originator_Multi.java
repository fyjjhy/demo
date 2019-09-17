package design_patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 发起人角色<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Originator_Multi {

    private List<String> states;

    // 检查点指数
    private int index;

    public Originator_Multi() {
        states = new ArrayList<>();
        index = 0;
    }

    // 工厂方法，返还一个新的备忘录对象
    public Memento_Multi createMemento() {
        return new Memento_Multi(states, index);
    }

    // 将发起人恢复到备忘录对象记录的状态上
    public void restoreMemento(Memento_Multi mementoMulti) {
        states = mementoMulti.getStates();
        index = mementoMulti.getIndex();
    }

    // 状态赋值方法
    public void setStates(String state) {
        states.add(state);
        index++;
    }

    // 打印所有状态
    public void printStates() {
        for (String state : states) {
            System.out.println(state);
        }
    }
}
