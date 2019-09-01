package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <Description> 用正则匹配src中内容-非懒惰模式匹配<br>
 * 从'往后匹配，直到最后一个'匹配结束
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月01日 <br>
 * @see regex <br>
 * @since V1.0 <br>
 */
public class TestRegEx {
    public static void main(String[] args) {
        String str = "<img src='test.jpg' width='60px' height='80px'/>";
        Pattern pattern = Pattern.compile("src='.*'");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
