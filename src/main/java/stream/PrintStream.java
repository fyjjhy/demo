package stream;

import common.CommonConstant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年02月28日 <br>
 * @see stream <br>
 * @since V1.0 <br>
 */
public class PrintStream {

    public static void main(String[] args) {
        // 定义抽象路径
        String path = new StringBuilder().append(CommonConstant.FILE_PATH)
                .append("printStream").toString();
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        // 定义文件名称
        String fileName = System.currentTimeMillis() + "";
        File tempFile = new File(path, fileName + ".txt");
        // 定义输出流
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));) {
            String[] buff = new String[] { "hello", "world", "!" };
            for (String str : buff) {
                printWriter.format("words: %s\n", str);
            }
            printWriter.flush();
        }
        catch (Exception e) {
            throw new RuntimeException("PrintWriter写入失败!");
        }
    }
}
