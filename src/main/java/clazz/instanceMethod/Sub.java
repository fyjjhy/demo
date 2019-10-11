package clazz.instanceMethod;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月30日 <br>
 * @see clazz.instanceMethod <br>
 * @since V1.0 <br>
 */
public class Sub extends Super {

    private void getSubName() {
        System.out.println("Sub getSubName");
        getSuperName();
        getSuperValue();
        getSubValue();
    }

    private static void getSubValue() {
        System.out.println("Sub Value");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.getSubName();
    }
}
