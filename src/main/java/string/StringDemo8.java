package string;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月19日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo8 {

    public static void main(String[] args) {
        String str = "123";
        String ori = reverse(str);
        System.out.println(ori);
    }

    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
