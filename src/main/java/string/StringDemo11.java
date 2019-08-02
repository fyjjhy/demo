package string;

import utils.GlobalConstants;
import utils.StringUtils;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月31日 <br>
 * @see string <br>
 * @since V1.0 <br>
 */
public class StringDemo11 {

    public static void main(String[] args) {
        String ips = new StringBuilder(GlobalConstants.SPLITOR).append(GlobalConstants.SPLITOR).append("127.0.0.1,127.0.0.2").append(GlobalConstants.SPLITOR).toString();
        ips = StringUtils.trim(ips, "right");
        System.out.println(ips);
    }
}
