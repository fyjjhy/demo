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
public class Client {

    public static void main(String[] args) {
        // 命令接收者Receiver
        Tv tv = new Tv();

        // 开机命令ConcreteCommond
        CommandOn commandOn = new CommandOn(tv);

        // 关机命令ConcreteCommond
        CommandOff commandOff = new CommandOff(tv);

        // 频道切换命令ConcreteCommond
        CommandChange commandChange = new CommandChange(tv, 2);

        // 命令控制对象Invoker
        Control control = new Control(commandOn, commandOff, commandChange);

        // 开机
        control.turnOn();

        // 切换频道
        control.changeChannel();

        // 关机
        control.turnOff();
    }
}
