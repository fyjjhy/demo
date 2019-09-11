package design_patterns.decorator;

/**
 * <Description> 汉堡基类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public abstract class Hamburger {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
