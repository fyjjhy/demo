package design_patterns.decorator;

/**
 * <Description> 鸡腿堡类(被装饰者的初始状态，有些自己的简单装饰，相当于上面的Person)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public class ChickenBurger extends Hamburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
