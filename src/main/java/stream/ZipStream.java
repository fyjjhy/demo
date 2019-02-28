package stream;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年02月27日 <br>
 * @see stream.ZipStream <br>
 * @since V1.0 <br>
 */
public class ZipStream {

    public static void main(String[] args) {
        // 1.定义要压缩的文件

        String path = new StringBuilder().append("D:").append(File.separator)
                .append("stream").append(File.separator).append("fileStream").toString();
        File file = new File(path, "1551282052241.txt");
        // 2.获取压缩文件名称
        String zipPath = new StringBuilder().append("D:").append(File.separator)
                .append("stream").append(File.separator).append("zipStream").toString();
        File tempFile = new File(zipPath);
        if (!tempFile.exists()) {
            tempFile.mkdirs();
        }
        File zipFile = new File(zipPath, "1551282052241.zip");
        // 3. 定义文件的输入流
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (Exception e) {
            System.out.println(e);
        }
        // 4.声明压缩流对象
        ZipOutputStream zos = null;
        try {
            zos = new ZipOutputStream(new FileOutputStream(zipFile));
            // 5.设置ZipEntry对象
            zos.putNextEntry(new ZipEntry(file.getName()));
            int temp = 0;
            // 6.从文件流中读取内容
            while ((temp = is.read()) != -1)  {
                zos.write(temp);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // 关闭输入流
            IOUtils.closeQuietly(is);
            // 关闭输出流
            IOUtils.closeQuietly(zos);
        }

        ZipInputStream zis = null;
        FileOutputStream fos = null;
        try {
            zis = new ZipInputStream(new FileInputStream(zipFile));
            ZipEntry ze = null;
            byte[] buff = new byte[1024];
            while ((ze = zis.getNextEntry()) != null) {
                fos = new FileOutputStream(new File(zipPath, System.currentTimeMillis() + ".txt"));
                int len = 0;
                while ((len = zis.read(buff)) != -1) {
                    fos.write(buff, 0, len);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            IOUtils.closeQuietly(zis);
            IOUtils.closeQuietly(fos);
        }
    }
}
