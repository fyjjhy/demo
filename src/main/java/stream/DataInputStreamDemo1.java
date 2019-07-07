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
public class DataInputStreamDemo1 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
        System.out.println(dis.readByte());
        System.out.println(dis.readChar());
        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
    }
}
