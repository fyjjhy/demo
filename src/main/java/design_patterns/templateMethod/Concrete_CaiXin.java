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
// 炒蒜蓉菜心的类
public class Concrete_CaiXin extends AbstractMethod {
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜的菜心");
    }

    @Override
    void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
