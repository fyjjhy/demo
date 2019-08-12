/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月10日 <br>
 * @see RuntimeDemo01 <br>
 * @since V1.0 <br>
 */
public class RuntimeDemo01 {

    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("可用的处理器核心数目：" + count);
    }
}
