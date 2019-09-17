package design_patterns.memento;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Caretaker {

    private Memento memento;

    // 备忘录取值方法
    public Memento retrieveMemento() {
        return this.memento;
    }

    // 备忘录的赋值方法
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
