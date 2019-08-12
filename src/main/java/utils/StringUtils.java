package utils;

import org.apache.commons.lang3.CharUtils;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月31日 <br>
 * @see StringUtils <br>
 * @since V1.0 <br>
 */
public class StringUtils {

    public static String trim(String text, String type) {
        if ("left".equals(type)) {
            System.out.println(text);
            return text.replaceAll("^\\,+", GlobalConstants.BLANK);
        } else if ("right".equals(type)) {
            return text.replaceAll("\\,+$", GlobalConstants.BLANK);
        }
        return text.replaceAll("^\\,+|\\,+$", GlobalConstants.BLANK);
    }
}
