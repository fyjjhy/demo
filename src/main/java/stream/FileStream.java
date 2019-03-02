package stream;

import DateUtil.DateUtil;
import common.CommonConstant;
import common.DateConstant;
import funcUtil.FileUtil;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * <Description> FileOutputStream和FileInputStream<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年02月27日 <br>
 * @see stream.FileStream <br>
 * @since V1.0 <br>
 */
public class FileStream {

    public static void main(String[] args) {
        // 路径名
        String path = new StringBuilder().append(CommonConstant.FILE_PATH).append("fileStream").toString();
        // 创建目录
        FileUtil.newFolder(path);
        // 文件名称
        String fileName = DateUtil.data2String(DateUtil.getCurrentDate(), DateConstant.DATETIME_FORMAT_14);
        File tempFile = new File(path, fileName + ".txt");

        // 声明输出流
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(tempFile);
            fos.write("hello".getBytes());
            fos.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            IOUtils.closeQuietly(fos);
        }

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(tempFile);
            byte[] buff = new byte[1024];
            int len = fis.read(buff);
            String str = new String(buff, 0, len);
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            IOUtils.closeQuietly(fis);
        }

    }
}
