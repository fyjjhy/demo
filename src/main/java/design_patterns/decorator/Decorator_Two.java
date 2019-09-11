package design_patterns.decorator;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public class Decorator_Two extends Decorator {
    public Decorator_Two(Human human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("找到一件D&G。。。");
    }

    public void findTheTarget() {
        System.out.println("在Map上找到神秘花园和城堡。。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTheTarget();
    }
}
