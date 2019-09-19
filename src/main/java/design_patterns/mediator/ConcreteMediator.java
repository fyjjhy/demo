package design_patterns.mediator;

/**
 * <Description> 具体调停者类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public class ConcreteMediator implements Mediator {

    // 持有并维护同事A
    private ConcreteColleagueA colleagueA;

    // 持有并维护同事B
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague colleague) {
        // 某一个同事类发生了变化，通常需要与其他同事交互，
        // 具体协调相应的同事对象来实现协作行为
    }
}
