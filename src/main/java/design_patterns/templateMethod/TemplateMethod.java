package design_patterns.templateMethod;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.templateMethod <br>
 * @since V1.0 <br>
 */
public class TemplateMethod {
    public static void main(String[] args) {
        // 炒--手撕包菜
        Concrete_BaoCai baoCai = new Concrete_BaoCai();
        baoCai.cookProcess();

        // 炒--蒜蓉菜心
        Concrete_CaiXin caiXin = new Concrete_CaiXin();
        caiXin.cookProcess();
    }
}
