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
public class PutStream {

    public static void main(String[] args) {
        // 定义抽象目录
        String path = new StringBuilder().append(CommonConstant.FILE_PATH)
                .append("putStream").toString();
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        // 定义文件名称
        String fileName = System.currentTimeMillis() + "";
        File tempFile = new File(path, fileName + ".txt");
        // 定义输出流
        try (
                OutputStream outputStream = new FileOutputStream(tempFile);
                Writer outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
        ) {
            outputStreamWriter.write("InputStreamReader类是字节到字符的转化桥梁," +
                    "InputStream到Reader的过程要指定编码字符集,否则将采用操作系统默认的字符集," +
                    "很可能会出现乱码问题,StreamDecoder正是完成字节到字符的解码的实现类");
        } catch (Exception e) {
            throw new RuntimeException("写入失败!");
        }

        // 定义输入流
        try (
                InputStream inputStream = new FileInputStream(tempFile);
                Reader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        ) {
            int data = inputStreamReader.read();
            while (data != -1) {
                char theData = (char) data;
                System.out.print(theData);
                data = inputStreamReader.read();
            }
        } catch (Exception e) {
            throw new RuntimeException("读取失败!");
        }
    }
}
