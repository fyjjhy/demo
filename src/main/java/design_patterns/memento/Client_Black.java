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
public class Client_Black {

    public static void main(String[] args) {
        Originator_Black originatorBlack = new Originator_Black();
        Caretaker_Black caretakerBlack = new Caretaker_Black();
        // 改变负责人对象的状态
        originatorBlack.setState("On");
        System.out.println("1:" + originatorBlack.getState());
        // 创建备忘录对象，并将发起人对象的状态存储起来
        caretakerBlack.saveMemento(originatorBlack.createMemento());
        // 修改发起人对象的状态
        originatorBlack.setState("Off");
        System.out.println("2:" + originatorBlack.getState());
        // 恢复发起人对象的状态
        originatorBlack.restoreMemento(caretakerBlack.retrieveMemento());
        System.out.println("3:" + originatorBlack.getState());
    }
}
