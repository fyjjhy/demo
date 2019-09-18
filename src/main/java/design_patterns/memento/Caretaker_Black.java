package design_patterns.memento;

/**
 * <Description> 负责人角色类Caretaker能够得到的备忘录对象是以MementoIF为接口的，由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容。<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Caretaker_Black {
    private MementoIF_Black mementoIF;

    // 备忘录取值方法
    public MementoIF_Black retrieveMemento() {
        return mementoIF;
    }

    // 备忘录赋值方法
    public void saveMemento(MementoIF_Black mementoIF) {
        this.mementoIF = mementoIF;
    }
}
