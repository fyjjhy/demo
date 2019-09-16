package design_patterns.strategy;

/**
 * <Description> 客户端调用-让销售员进行促销活动的落地<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.strategy <br>
 * @since V1.0 <br>
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context_SalesMan salesMan;
        // 春节来了，使用春节促销活动
        System.out.println("对于春节：");
        salesMan = new Context_SalesMan("A");
        salesMan.salesManShow();

        // 中秋节来了，使用中秋节促销活动
        System.out.println("对于中秋节：");
        salesMan = new Context_SalesMan("B");
        salesMan.salesManShow();

        //圣诞节来了，使用圣诞节促销活动
        System.out.println("对于圣诞节：");
        salesMan = new Context_SalesMan("C");
        salesMan.salesManShow();
    }
}
