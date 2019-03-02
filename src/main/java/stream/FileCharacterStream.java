package stream;

import DateUtil.DateUtil;
import common.CommonConstant;
import common.DateConstant;
import funcUtil.FileUtil;

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
public class FileCharacterStream {

    public static void main(String[] args) {

        // 添加路径
        String path = new StringBuilder().append(CommonConstant.FILE_PATH)
                .append("file").toString();
        // 创建目录
        FileUtil.newFolder(path);
        // 添加文件名
        String fileName = DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_14);
        File tempFile = new File(path, fileName + ".txt");
        // 定义输出流
//        try {
//            Writer writer = new FileWriter(tempFile);
//            writer.write("对文本文件(保存字符的文件)进行以字符为单位写入!");
//            writer.flush();
//        } catch (IOException e) {
//            throw new RuntimeException("FileWriter写入失败!", e);
//        }
        try (
                Writer writer = new FileWriter(tempFile);
        ) {
            writer.write("对文本文件(保存字符的文件)进行以字符为单位写入!");
        } catch (Exception e) {
            throw new RuntimeException("FileWriter写入失败!");
        }

        // 定义输入流
        try (Reader reader = new FileReader(tempFile);) {
            int data = reader.read();
            while (data != -1) {
                char theData = (char) data;
                System.out.print(theData);
                data = reader.read();
            }
        } catch (Exception e) {
            throw new RuntimeException("FileReader读取失败!");
        }
    }
}
