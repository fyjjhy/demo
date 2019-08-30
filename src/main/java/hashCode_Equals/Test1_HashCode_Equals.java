package hashCode_Equals;

import java.util.HashMap;
import java.util.Map;

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
public class Test1_HashCode_Equals {
    public static void main(String[] args) {
        Map<HashCode_Equals_Entity1, Object> map = new HashMap<>();
        map.put(new HashCode_Equals_Entity1(), new Object());
        map.put(new HashCode_Equals_Entity1(), new Object());
        System.out.println(map.size());
    }
}
