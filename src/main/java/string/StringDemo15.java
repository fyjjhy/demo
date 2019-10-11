package string;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo15 {
    public static void main(String[] args) {
        String s1 = "Topwalk";
        String s2 = "Company";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        StringBuffer buffer = new StringBuffer(s1);
        System.out.println(buffer.append(s2));
    }
}
