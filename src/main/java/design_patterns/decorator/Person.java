package design_patterns.decorator;

/**
 * <Description> 定义被装饰者，被装饰者初始状态有些自己的装饰<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。。");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢。。。");
    }
}
