package design_patterns.command;

/**
 * <Description> 开机命令ConcreteCommand<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.command <br>
 * @since V1.0 <br>
 */
public class CommandOn implements Command {

    private Tv tv;

    public CommandOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
