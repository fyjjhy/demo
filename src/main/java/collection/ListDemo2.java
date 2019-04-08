package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月08日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class ListDemo2 {

    public static void main(String[] args) {
        List<String> parentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            parentList.add(String.valueOf(i));
        }
        List<String> subList = parentList.subList(1,3);
        for (String str : subList) {
            System.out.println(str);
        }
        subList.set(0, "new 1");
        for (String str : parentList) {
            System.out.println(str);
        }
        subList.add(String.valueOf(2.5));
        for (String str : parentList) {
            System.out.println(str);
        }
        parentList.set(2, "new 2");
        for (String str : subList) {
            System.out.println(str);
        }
        parentList.add("undefine");
        for (String str : subList) {
            System.out.println(str);
        }
        subList.get(0);
    }
}
