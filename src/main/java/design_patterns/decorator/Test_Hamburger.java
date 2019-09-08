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
public class Test_Hamburger {
    public static void main(String[] args) {
        Hamburger hamburger = new ChickenBurger();
        System.out.println(hamburger.getName() + " 价钱：" + hamburger.getPrice());

        Lettuce lettuce = new Lettuce(hamburger);
        System.out.println(lettuce.getName() + " 价钱：" + lettuce.getPrice());

        Chilli chilli = new Chilli(hamburger);
        System.out.println(chilli.getName() + " 价钱：" + chilli.getPrice());

        Chilli chilli1 = new Chilli(lettuce);
        System.out.println(chilli1.getName() + " 价钱：" + chilli1.getPrice());

        Sauce sauce = new Sauce(hamburger);
        System.out.println(sauce.getName() + " 价钱：" + sauce.getPrice());

        Sauce sauce1 = new Sauce(chilli1);
        System.out.println(sauce1.getName() + " 价钱：" + sauce1.getPrice());
    }
}
