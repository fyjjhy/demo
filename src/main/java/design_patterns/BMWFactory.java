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
public class BMWFactory {
    public BMW createBMW(int type) {
        switch (type) {
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
