package design_patterns.mediator;

/**
 * <Description> 抽象调停者类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public interface Mediator {
    // 同事对象在自身改变的时候来通知调停者方法，让调停者去负责相应的与其他同事对象的交互
    public void changed(Colleague colleague);
}
