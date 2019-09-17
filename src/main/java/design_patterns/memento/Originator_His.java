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
public class Originator_His {

    private String state;

    public void changeState(String state) {
        this.state = state;
        System.out.println("状态改变为：" + state);
    }

    // 工厂方法，返还一个新的备忘录对象
    public Memento_His createMementoHis() {
        return new Memento_His(this);
    }

    // 将发起人恢复到备忘录所记录的状态上
    public void restoreMemento(MementoIF_His mementoIFHis) {
        Memento_His mementoHis = (Memento_His) mementoIFHis;
        changeState(mementoHis.getState());
    }

    private class Memento_His implements MementoIF_His {
        private String state;

        private Memento_His(Originator_His originator) {
            this.state = originator.state;
        }

        private String getState() {
            return state;
        }
    }
}
