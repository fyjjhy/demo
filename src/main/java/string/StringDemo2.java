package string;

import java.util.Arrays;

/**
 * <Description> byte[]和String互相转换<br>
 *【描述】
 * 除非必要，否则不要将它们互相转换，他们代表不同的数据，通常String代表文本字符串，byte数组针对二进制数据
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo2 {

    public static void main(String[] args) {
        String string = "hello world";
        byte[] bytes = string.getBytes();
        System.out.println(Arrays.toString(bytes));
        String str = new String( bytes);
        System.out.println("decoded String:"+str);
    }
}
