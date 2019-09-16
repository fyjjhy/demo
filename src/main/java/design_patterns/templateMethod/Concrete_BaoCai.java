package design_patterns.templateMethod;

/**
 * <Description> 创建具体模板（Concrete Class）,即”手撕包菜“和”蒜蓉炒菜心“的具体步骤<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.templateMethod <br>
 * @since V1.0 <br>
 */
// 炒手撕包菜的类
public class Concrete_BaoCai extends AbstractMethod {
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
