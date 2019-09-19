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
public abstract class West {
    public abstract void gotWest1(SubEast1 east);

    public abstract void gotWest2(SubEast2 east);
}
