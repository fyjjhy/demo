package basics;

import java.util.Random;

/**
 * <Description> Random<br>
 *【构造函数】
 * a.public Random()
 * 该构造函数使用一个和当前系统时间对应的相对时间有关的数字作为种子数，然后使用这个种子数构造Random对象。
 * Random random = new Random();
 * b.public Random(long seed)
 * 该构造方法可以通过指定一个种子数进行构建。
 * Random random = new Random(10);
 *【强调】
 * 种子数只是随机算法的起源数字，和生成的随机数字的区间无关。
 *【问题】
 * 相同种子数的Random对象，相同次数生成的随机数字时完全相同的。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class RandomDemo2 {

    private void random() {
        int i = 0, j = 0;
        Random r1 = new Random(10);
        Random r2 = new Random(10);
        i = r1.nextInt();
        j = r2.nextInt();
        System.out.println(i + "-----" + j);
    }

    public static void main(String[] args) {
        RandomDemo2 randomDemo2 = new RandomDemo2();
        randomDemo2.random();
    }
}
