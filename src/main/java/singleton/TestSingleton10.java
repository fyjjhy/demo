package singleton;

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
 * @CreateDate 2019年03月05日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton10 {

    public static void main(String[] args) {
        TestSingleton5 testSingleton5 = TestSingleton5.getInstance();
        String path = new StringBuilder().append(CommonConstant.FILE_PATH)
                .append("singleton").toString();
        // 创建目录
        FileUtil.newFolder(path);
        String fileName = DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_14);
        File file = new File(path, fileName + ".txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(testSingleton5);
            System.out.println(testSingleton5.hashCode());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("写出失败!");
        }

        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            TestSingleton5 singleton5 = (TestSingleton5) objectInputStream.readObject();
            System.out.println(singleton5.hashCode());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("读取失败");
        }
    }
}
