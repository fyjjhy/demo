package binary;

import java.text.NumberFormat;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see binary <br>
 * @since V1.0 <br>
 */
public class Demo1 {

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setGroupingUsed(false);
        // 将十进制转换成二进制
        String binaryNum = Integer.toBinaryString(2147483645);

        System.out.println(Integer.MIN_VALUE + " toBinary: " + binaryNum);

        binaryNum = Integer.toBinaryString(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + " toBinary: " + binaryNum);

        binaryNum = "1001";
        // 将二进制转换成十进制
        int number = Integer.valueOf(binaryNum, 2);
        System.out.println(binaryNum + " toDecimal: " + number);

        System.out.println("乘以3：" + Integer.MAX_VALUE * 3);
        System.out.println("乘以3：" + Integer.MIN_VALUE * 3);
    }
}
