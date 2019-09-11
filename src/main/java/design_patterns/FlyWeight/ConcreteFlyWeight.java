package design_patterns.FlyWeight;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月11日 <br>
 * @see design_patterns.FlyWeight <br>
 * @since V1.0 <br>
 */
public class ConcreteFlyWeight extends FlyWeight {

    private String str;

    public ConcreteFlyWeight(String str) {
        this.str = str;
    }

    @Override
    public void operation() {
        System.out.println("Concrete---FlyWeight: " + str);
    }
}
