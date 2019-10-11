package dataStructure.stack;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see dataStructure.stack <br>
 * @since V1.0 <br>
 */
public class IntegerToNhexTest {
    public static void main(String[] args) {
        String s = StackUtils.integerToNhex(123456, 16);
        System.out.println("转换得到的16进制数为:"+s);
    }
}
