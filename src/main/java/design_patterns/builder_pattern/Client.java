package design_patterns.builder_pattern;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class Client {

    public static void main(String[] args) {
        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        // 沟通需求后，老板叫装机人员去装电脑
        director.construct(builder);

        // 装完后，组装人员搬来组装好的电脑
        Computer computer = builder.getComputer();
        // 组装人员展示电脑给小城看
        computer.show();
    }
}
