package stream;

import common.CommonConstant;

import java.io.*;

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
public class BufferedCharacterStream {

    public static void main(String[] args) {
        // 定义文件操作目录
        String path = new StringBuilder().append(CommonConstant.FILE_PATH)
                .append("bufferedCharacterStream").toString();
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        // 定义文件名称
        String fileName = System.currentTimeMillis() + "";
        File tempFile = new File(path, fileName + ".txt");
        // 定义输出流
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile))) {
            bufferedWriter.write("BufferedReader、BufferedWriter提供了ReadLine、newLine()这种以行为单位的字符读写机制!");
            bufferedWriter.newLine(); // 添加系统换行符
        }
        catch (Exception e) {
            throw new RuntimeException("BufferedWriter写入失败!");
        }

        // 定义输入流
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(tempFile))) {
            String data = bufferedReader.readLine(); // 一行一行来读取，当读取到回车符的时候，就先返回给字符串，然后再进行下一行的读取
            while (data != null) {
                System.out.println(data);
                data = bufferedReader.readLine();
            }
        }
        catch (Exception e) {
            throw new RuntimeException("BufferedReader读取失败!");
        }
    }
}
