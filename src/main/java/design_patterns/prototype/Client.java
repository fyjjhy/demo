package design_patterns.prototype;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.prototype <br>
 * @since V1.0 <br>
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype cloneCp = (ConcretePrototype) concretePrototype.clone();
            cloneCp.show();
        }
    }
}
