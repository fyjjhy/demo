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
public class Client_Multi {

    public static void main(String[] args) {
        Originator_Multi originator = new Originator_Multi();
        Caretaker_Multi caretaker = new Caretaker_Multi(originator);
        // 改变状态
        originator.setStates("state 0");
        // 建立一个检查点
        caretaker.createMemento();
        // 改变状态
        originator.setStates("state 1");
        // 建立一个检查点
        caretaker.createMemento();
        // 改变状态
        originator.setStates("state 2");
        // 建立一个检查点
        caretaker.createMemento();
        // 改变状态
        originator.setStates("state 3");
        // 建立一个检查点
        originator.createMemento();
        // 打印所有检查点
        originator.printStates();
        System.out.println("-----------------恢复检查点-----------------");
        // 恢复到第二个检查点
        caretaker.restoreMemento(2);
        // 打印所有检查点
        originator.printStates();
    }
}
