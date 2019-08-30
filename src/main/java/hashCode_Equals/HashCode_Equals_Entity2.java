package hashCode_Equals;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月30日 <br>
 * @see hashCode_Equals <br>
 * @since V1.0 <br>
 */
public class HashCode_Equals_Entity2 {

    @Override
    public boolean equals(Object obj) {
        System.out.println("判断equals");
        return true;
    }

    @Override
    public int hashCode() {
        System.out.println("判断hashcode");
        return 1;
    }
}
