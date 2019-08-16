package string;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * <Description> 多反斜杠转义<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月02日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo12 {

    public static void main(String[] args) {
        String str = "{\\\"name\\\":\\\"spy\\\",\\\"id\\\":\\\"123456\\\"}";
        System.out.println(str);
        String str1 = StringEscapeUtils.unescapeJava(str);
        System.out.println(str1);
        String str2 = str.replaceAll("\\\\\\\\", "");
        System.out.println(str2);
    }
}
