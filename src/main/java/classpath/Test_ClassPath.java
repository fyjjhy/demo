package classpath;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see classpath <br>
 * @since V1.0 <br>
 */
public class Test_ClassPath {
    public static void main(String[] args) {
        String path = System.getProperty("java.class.path");
        String[] paths = path.split(";");
        for (String p : paths) {
            System.out.println(p + "\n");
        }

        System.out.println("====================java.ext.dirs=========================");
        String p1 = System.getProperty("java.ext.dirs");
        System.out.println(p1);
    }
}
