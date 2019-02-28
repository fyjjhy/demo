package stream;

import com.hbasesoft.framework.common.utils.PropertyHolder;
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
        String path = new StringBuilder().append("D:").append(File.separator).append("stream").append(File.separator).append("fileStream").toString();
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        // 文件名称
        String fileName = System.currentTimeMillis() + "";

        File tempFile = new File(path, fileName + ".txt");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(tempFile);
            fos.write("hello".getBytes());
            fos.flush();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
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
