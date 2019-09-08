package design_patterns.prototype;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.prototype <br>
 * @since V1.0 <br>
 */
public class Prototype implements Cloneable {

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = null;
        prototype = (Prototype) super.clone();
        return prototype;
    }
}
