package design_patterns.decorator;

/**
 * <Description> 测试类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.decorator <br>
 * @since V1.0 <br>
 */
public class Test {
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new Decorator_Two(new Decorator_First(new Decorator_Zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
