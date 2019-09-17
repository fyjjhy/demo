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
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        // 改变负责人对象的状态
        originator.setState("On");
        // 创建备忘录对象，并将发起人对象的状态存储起来
        caretaker.saveMemento(originator.createMemento());
        Memento memento = caretaker.retrieveMemento();
        System.out.println("memento:" + memento.getState());
        // 修改发起人状态
        originator.setState("Off");
        System.out.println(originator.getState());
        // 恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator.getState());
    }
}
