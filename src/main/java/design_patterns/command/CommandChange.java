package design_patterns.command;

/**
 * <Description> 频道切换命令ConcreteCommand<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.command <br>
 * @since V1.0 <br>
 */
public class CommandChange implements Command {

    private Tv tv;

    private int channel;

    public CommandChange(Tv tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
