package string;

import java.util.Base64;

/**
 * <Description> <br>
 *【Base64】
 * 将二进制数据编码的方式，UTF-8和UTF-16是将文本数据编码的方式
 * 【需求】
 * 将二进制数据编码为文本数据
 * 【链接地址】
 * https://www.cnblogs.com/keeplearnning/p/7003415.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo3 {

    public static void main(String[] args) {
        // 将字符串转换成byte[]
        byte[] bytes = "hello world".getBytes();
        // 编码：将二进制数据转换成文本数据
        String encoder = Base64.getEncoder().encodeToString(bytes);
        // 解码：将文本数据转换成二进制数据
        byte[] decode = Base64.getDecoder().decode(encoder);
        // 将byte[]转换成字符串
        System.out.println(new String(decode));
    }
}
