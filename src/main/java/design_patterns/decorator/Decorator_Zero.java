package design_patterns.decorator;

/**
 * <Description> 定义三层装饰，这是第一个，第二个第三个功能一次细化，即装饰者的功能越来越多<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public class Decorator_Zero extends Decorator {
    public Decorator_Zero(Human human) {
        super(human);
    }

    public void getHome() {
        System.out.println("进房子。。。");
    }

    public void findMap() {
        System.out.println("书房找找Map。。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        getHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
