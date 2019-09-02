package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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
public class Test3_Lambda {
    public static void main(String[] args) {
        List<Double> costBeforeTax = Arrays.asList(100d, 200d, 300d, 400d, 500d);
        for (Double cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
        }

        System.out.println("========================================================");
        costBeforeTax.stream().map(cost -> cost + .12 * cost).forEach(System.out::println);
    }
}
