package basics;

/**
 * <Description> <br>
 * 【链接地址】
 * https://blog.csdn.net/u013063153/article/details/72764311
 * long:8个字节，存储长整数
 * double:8个字节，存储双精度浮点数
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class DoubleToLongDemo1 {

    public static void main(String[] args) {
        double random = Math.round(Math.random() * 1000);
        System.out.println(random);
        long l = new Double(random).longValue();
        System.out.println(l);
    }
}
