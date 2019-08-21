package exception;

import java.io.File;
import java.io.IOException;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月21日 <br>
 * @see exception <br>
 * @since V1.0 <br>
 */
public class ExceptionDemo {
    public static void main(String[] args) throws MyException {
        File file = new File("D:/temp/temp.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new MyException("文件创建失败", e);
            }
        }
    }
}
