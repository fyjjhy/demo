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
public class Client_His {

    public static void main(String[] args) {
        Originator_His originator = new Originator_His();
        // 修改状态
        originator.changeState("state 0");
        // 创建备忘录
        MementoIF_His mementoIFHis = originator.createMementoHis();
        // 修改状态
        originator.changeState("state 1");
        // 按照备忘录恢复对象的状态
        originator.restoreMemento(mementoIFHis);
    }
}
