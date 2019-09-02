package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class TestLambda {
    public static void main(String[] args) {
        List<String> pointList = new ArrayList<>();
        pointList.add("1");
        pointList.add("2");
        pointList.forEach(p -> {
            System.out.println(p);
        });
    }
}
