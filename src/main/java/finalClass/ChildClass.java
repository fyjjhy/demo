package finalClass;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月17日 <br>
 * @see finalClass <br>
 * @since V1.0 <br>
 */
public class ChildClass extends FatherClass {

    // public int value;
    public void info(){
        super.info();
        value=200;
        System.out.println("value=" + value);
        System.out.println("super.value=" + super.value);
    }
}
