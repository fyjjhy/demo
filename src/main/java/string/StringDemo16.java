package string;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月16日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo16 {
    public static void main(String[] args) {
        String specCode = "abcd12";
        String goodsSn = "qw";
        String newSpecCode = specCode.replace(specCode.substring(0, specCode.length() - 2), goodsSn);
        System.out.println(newSpecCode);
        System.out.println(specCode.substring(0, specCode.length() - 2));
        String specCodeStart = specCode.substring(0, specCode.length() - 2);
        if (!(goodsSn.equals(specCodeStart))) {
            System.out.println(specCode.replace(specCodeStart, goodsSn));
        }
    }
}
