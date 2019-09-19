package design_patterns.visitor;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.visitor <br>
 * @since V1.0 <br>
 */
public class SubEast1 extends East {

    public String myName1() {
        return "SubEast1";
    }

    @Override
    public void goEast(West west) {
        System.out.println(this);
        west.gotWest1(this);
    }
}
