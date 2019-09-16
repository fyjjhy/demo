package design_patterns.strategy;

/**
 * <Description> 定义具体策略角色（Concrete Strategy）：每个节日具体的促销活动<br>
 * 为春节准备的促销活动A
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月12日 <br>
 * @see design_patterns.strategy <br>
 * @since V1.0 <br>
 */
public class StrategyA extends Strategy {
    @Override
    public void show() {
        System.out.println("为春节准备的促销活动A");
    }
}
