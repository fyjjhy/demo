package design_patterns.command;

/**
 * <Description> 关机命令ConcreteCommand<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.command <br>
 * @since V1.0 <br>
 */
public class CommandOff implements Command {

    private Tv tv;

    public CommandOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
