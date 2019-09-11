package design_patterns.decorator;

/**
 * <Description> 酱(装饰者的第三层，相当于上面的Decorator_Two)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public class Sauce extends Condiment {

    Hamburger hamburger;

    public Sauce(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + "加酱";
    }

    @Override
    public double getPrice() {
        return hamburger.getPrice() + 1.0;
    }
}
