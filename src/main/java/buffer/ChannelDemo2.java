package buffer;

import common.CommonConstant;

import java.io.File;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月21日 <br>
 * @see buffer <br>
 * @since V1.0 <br>
 */
public class ChannelDemo2 {

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        String readPath = new StringBuilder(userHome).append(File.separator)
                .append("log").append(File.separator)
                .append("hbasesoft").append(File.separator)
                .append("hello-world").append(File.separator)
                .append("trans.json").toString();
        System.out.println(readPath);
    }
}
