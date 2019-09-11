package design_patterns.bridge;

/**
 * <Description> 客戶端程序<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月10日 <br>
 * @see design_patterns.bridge <br>
 * @since V1.0 <br>
 */
public class Client {

    public static void main(String[] args) {
        // 小笔画红色
        BrushPenAbstraction brushPenAbstraction = new SmallBrushPenRefinedAbstraction();
        brushPenAbstraction.setImplementorColor(new OnCreteImplementorRed());
        String str = brushPenAbstraction.operationDraw();
        System.out.println(str);
    }
}
