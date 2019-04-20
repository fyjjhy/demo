package string;

import java.io.UnsupportedEncodingException;

/**
 * <Description> 怎样将 GB2312 编码的字符串转换为 ISO-8859-1 编码的字符串？<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月19日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo7 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你好";
        String string = new String(str.getBytes("GB2312"), "ISO-8859-1");
        System.out.println(string);
    }

}
