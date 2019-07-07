package stream;

import common.CommonConstant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * <Description> 追加<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月06日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class RandomAccessFileDemo3 {

    public static void main(String[] args) throws IOException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.write("\r\n红场阅兵".getBytes());
    }
}
