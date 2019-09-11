package design_patterns;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月04日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class Customer {
    public static void main(String[] args) {
//        BMW320 bmw320 = new BMW320();
//        BMW523 bmw523 = new BMW523();
//        BMWFactory factory = new BMWFactory();
//        BMW bmw320 = factory.createBMW(320);
//        BMW bmw523 = factory.createBMW(523);

//        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
//        BMW320 bmw320 = (BMW320) factoryBMW320.createBMW();
//
//        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
//        BMW523 bmw523 = (BMW523) factoryBMW523.createBMW();

        // 生产宝马320系列配件
        FactoryBMW320_2 factoryBMW320_2 = new FactoryBMW320_2();
        factoryBMW320_2.createEngine();
        factoryBMW320_2.createAirCondition();

        // 生产宝马523系列配件
        FactoryBMW523_2 factoryBMW523_2 = new FactoryBMW523_2();
        factoryBMW523_2.createEngine();
        factoryBMW523_2.createAirCondition();
    }
}
