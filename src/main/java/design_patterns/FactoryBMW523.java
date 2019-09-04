package design_patterns;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月04日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class FactoryBMW523 implements BMWFactory2 {
    @Override
    public BMW createBMW() {
        return new BMW523();
    }
}
