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
public class SubEast2 extends East {

    public String myName2() {
        return "SubEast2";
    }

    @Override
    public void goEast(West west) {
        west.gotWest2(this);
    }
}
