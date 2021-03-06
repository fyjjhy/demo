package design_patterns.memento;

/**
 * <Description> 发起人角色类，发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Originator_White {

    private String state;

    // 返回一个新的备忘录对象
    public Memento_White createMemento() {
        return new Memento_White(state);
    }

    // 将发起人恢复到备忘录对象所记载的状态
    public void restoreMemento(Memento_White memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }
}
