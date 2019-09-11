package design_patterns.bridge;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月10日 <br>
 * @see design_patterns.bridge <br>
 * @since V1.0 <br>
 */
public class OnCreteImplementorRed extends ImplementorColor {

    public OnCreteImplementorRed() {
        this.value = "red";
    }

    @Override
    public String bepaint() {
        return this.value;
    }
}
