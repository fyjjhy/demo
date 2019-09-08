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
public class Decorator_First extends Decorator {
    public Decorator_First(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("去衣柜找找看。。。");
    }

    public void findPlaceOnMap() {
        System.out.println("在Map上找找。。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findPlaceOnMap();
    }
}
