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
public class SmallBrushPenRefinedAbstraction extends BrushPenAbstraction {
    @Override
    public String operationDraw() {
        return "Small and " + this.implementorColor.bepaint() + " drawing";
    }
}
