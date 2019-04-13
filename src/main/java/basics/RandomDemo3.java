package basics;

import java.util.Random;

/**
 * <Description> Random--Random类中的常用方法<br>
 *【说明】
 * Random类中各方法生成的随机数字是均匀分布的，也就是说区间内部的数字生成的几率的均等的。
 *【实例】
 * 随机生成一个整数，该整数以55%的几率生成1，以40%的几率生成2，以5%的几率生成3
 *【链接地址】
 * https://www.cnblogs.com/weink1215/p/4433790.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class RandomDemo3 {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        int m; // 结果数字
        if (number < 55) {
            m = 1;
        }
        else if (number < 95) {
            m = 2;
        }
        else {
            m = 3;
        }
        System.out.println(m);
    }
}
