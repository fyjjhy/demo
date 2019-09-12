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
public class FlyWeightPattern {

    FlyWeightFactory factory = new FlyWeightFactory();

    FlyWeight fly1;

    FlyWeight fly2;

    FlyWeight fly3;

    FlyWeight fly4;

    FlyWeight fly5;

    FlyWeight fly6;

    FlyWeight fly7;

    public FlyWeightPattern() {
        this.fly1 = factory.getFlyWeight("Google");
        this.fly2 = factory.getFlyWeight("Qutr");
        this.fly3 = factory.getFlyWeight("HUAWEI");
        this.fly4 = factory.getFlyWeight("Google");
        this.fly5 = factory.getFlyWeight("Apple");
        this.fly6 = factory.getFlyWeight("Google");
        this.fly7 = factory.getFlyWeight("HUAWEI");
    }

    public void showFlyWeight() {
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        fly7.operation();
        System.out.println("objSize=" + factory.getFlyWeightSize());
    }

    public static void main(String[] args) {
        System.out.println("The FlyWeight Pattern");
        FlyWeightPattern flyWeightPattern = new FlyWeightPattern();
        flyWeightPattern.showFlyWeight();
    }
}
