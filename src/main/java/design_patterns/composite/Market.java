package design_patterns.composite;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月12日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public abstract class Market {
    String name;

    public abstract void add(Market market);

    public abstract void remove(Market market);

    public abstract void payByCard();
}
