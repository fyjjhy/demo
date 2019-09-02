package lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
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
public class Test_Max_Min_Sum_Average {
    public static void main(String[] args) {
        // 获取数字的个数、最小值、最大值、总和以及平均值
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics statistics = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Highest prime number in List:" + statistics.getMax());
        System.out.println("Lowest prime number in List:" + statistics.getMin());
        System.out.println("Sum of all prime numbers:" + statistics.getSum());
        System.out.println("Average of all prime numbers:" + statistics.getAverage());
    }
}
