package design_patterns.command;

/**
 * <Description> 命令接收者Receiver<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.command <br>
 * @since V1.0 <br>
 */
public class Tv {
    public int currentChannel = 0;

    public void turnOn() {
        System.out.println("The televisino is on.");
    }

    public void turnOff() {
        System.out.println("The television is off.");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("Now TV channel is " + channel);
    }
}
