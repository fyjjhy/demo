package design_patterns.decorator;

/**
 * <Description> 辣椒(装饰者的第二层，相当于上面的Decorator_First)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public class Chilli extends Condiment {

    Hamburger hamburger;

    public Chilli(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + "加辣椒";
    }

    @Override
    public double getPrice() {
        return hamburger.getPrice(); // 辣椒免费
    }
}
