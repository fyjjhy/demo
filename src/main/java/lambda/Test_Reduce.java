package lambda;

import java.util.Arrays;
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
public class Test_Reduce {
    public static void main(String[] args) {
        // 为每个订单加上12%的税
        List<Double> costBeforeTax = Arrays.asList(100d, 200d, 300d, 400d, 500d);
        double total = 0;
        for (Double cost : costBeforeTax) {
            double price = cost + .12 * cost;
            total += price;
        }

        System.out.println("Total: " + total);
        // 新方法
        double bill = costBeforeTax.stream().map(cost -> cost + .12 * cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total: " + bill);
    }
}
