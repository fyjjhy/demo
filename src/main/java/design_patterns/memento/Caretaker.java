package design_patterns.memento;

/**
 * <Description> 负责人角色类，负责人角色负责保存备忘录对象，但是从不修改（甚至不查看）备忘录对象的内容。<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Caretaker {

    private Memento_White memento;

    // 备忘录取值方法
    public Memento_White retrieveMemento() {
        return this.memento;
    }

    // 备忘录的赋值方法
    public void saveMemento(Memento_White memento) {
        this.memento = memento;
    }
}
