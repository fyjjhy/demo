package design_patterns.bridge;

/**
 * <Description> 大毛笔<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月10日 <br>
 * @see design_patterns.bridge <br>
 * @since V1.0 <br>
 */
public class BigBrushPenRefinedAbstraction extends BrushPenAbstraction {
    @Override
    public String operationDraw() {
        return "Big and " + this.implementorColor.bepaint() + "drawing";
    }
}
