package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <Description> 用正则匹配src中内容-懒惰模式匹配<br>
 * 匹配到第一个'就结束了一次匹配
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月01日 <br>
 * @see regex <br>
 * @since V1.0 <br>
 */
public class Test1RegEx {
    public static void main(String[] args) {
        String str = "<img src='test.jpg' width='60px' height='80px'/>";
        Pattern pattern = Pattern.compile("src='.*?'");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
