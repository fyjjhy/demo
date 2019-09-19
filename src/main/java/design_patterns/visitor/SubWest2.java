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
public class SubWest2 extends West {
    @Override
    public void gotWest1(SubEast1 east) {
        System.out.println("SubWest2 + " + east.myName1());
    }

    @Override
    public void gotWest2(SubEast2 east) {
        System.out.println("SubWest2 + " + east.myName2());
    }
}
