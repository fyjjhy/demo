package design_patterns.mediator;

/**
 * <Description> 抽象同事类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public abstract class Colleague {

    // 持有一个调停者对象
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
