package stream;

import common.CommonConstant;

import java.io.*;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月06日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class DataOutputStreamDemo1 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
        byte b = 4;
        char c = 'c';
        int i = 12;
        float f = 3.3f;
        dos.writeByte(b);
        dos.writeChar(c);
        dos.writeInt(i);
        dos.writeFloat(f);
        dos.close();
    }
}
