package design_patterns.command;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.command <br>
 * @since V1.0 <br>
 */
public class Control {
    private Command onCommand, offCommand, changeChannel;

    public Control(Command onCommand, Command offCommand, Command changeChannel) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.changeChannel = changeChannel;
    }

    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }

    public void changeChannel() {
        changeChannel.execute();
    }
}
