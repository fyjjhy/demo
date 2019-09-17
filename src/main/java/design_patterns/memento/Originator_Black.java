package design_patterns.memento;

/**
 * <Description> 发起人角色类Originator中定义了一个内部的Memento类。由于此Memento类的全部接口都是私有的，因此只有它自己和发起人类可以调用。<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.memento <br>
 * @since V1.0 <br>
 */
public class Originator_Black {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
    }

    // 工厂方法，返还一个新的备忘录对象
    public MementoIF createMemento() {
        return new Memento(state);
    }

    // 发起人恢复到备忘录对象记录的状态
    public void restoreMemento(MementoIF mementoIF) {
        this.setState(((Memento)mementoIF).getState());
    }

    private class Memento implements MementoIF {
        private String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
