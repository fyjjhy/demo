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
public abstract class BrushPenAbstraction {

    protected ImplementorColor implementorColor;

    public void setImplementorColor(ImplementorColor color) {
        this.implementorColor = color;
    }

    public abstract String operationDraw();
}
