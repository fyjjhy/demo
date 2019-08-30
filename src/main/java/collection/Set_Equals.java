package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月30日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class Set_Equals {
    public static void main(String[] args) {
        Set<SetEntity> set = new HashSet<>();
        SetEntity entity1 = new SetEntity();
        entity1.setName("今天");
        entity1.setAge(28);
        set.add(entity1);
        SetEntity entity2 = new SetEntity();
        entity2.setName("今天");
        entity2.setAge(28);
        set.add(entity2);
        SetEntity entity3 = new SetEntity();
        entity3.setName("明天");
        entity3.setAge(29);
        set.add(entity3);
        System.out.println(set);
    }
}
