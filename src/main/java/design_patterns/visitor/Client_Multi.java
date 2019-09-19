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
public class Client_Multi {

    public static void main(String[] args) {
        // 组合1
        East east1 = new SubEast1();
        West west1 = new SubWest1();
        east1.goEast(west1);

        // 组合2
        East east2 = new SubEast1();
        West west2 = new SubWest2();
        east2.goEast(west2);
    }
}
