package algorithm;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月01日 <br>
 * @see algorithm <br>
 * @since V1.0 <br>
 */
public class Demo1 {

//    public static void main(String[] args) {
//        int total = 50;
//        int count = 0;
//        int num = 0;
//        while (total > 0) {
//            total--;
//            if (total % 3 == 0) {
//                num++;
//            }
//            if (total == 0) {
//                total += num;
//            }
//            count++;
//        }
//        System.out.println(count);
//    }

    public static void main(String[] args) {
        System.out.println("args: " + Arrays.toString(args));
        int n = 50; //初始饮料总数
        int i = 0; //兑换次数

        while (true) {
            // 喝 3 瓶
            n -= 3;
            // 兑换 1 瓶
            n++;
            // 兑换次数+1
            i++;
            if (n < 3) {
                System.out.println("共喝了" + (50 + i) + "瓶");
                break;
            }
        }
    }
}
