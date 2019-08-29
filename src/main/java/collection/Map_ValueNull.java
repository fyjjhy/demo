package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> NULL作为value<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月29日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Map_ValueNull {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", null);
        map.put("b", "c");
        System.out.println(map.get("a"));
    }
}
