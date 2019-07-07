package stream;

import common.CommonConstant;
import utils.funcUtil.FileUtil;

import java.io.File;
import java.io.IOException;

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
public class FileDemo2 {

    public static void main(String[] args) throws IOException {
        // 定义抽象路径名
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append("临时文件存放位置").append(File.separator)
                .append("文件目录").toString();
        File file = new File(path);
        file.mkdir();
        if (file.exists() && file.isDirectory()) {
            System.out.println("该目录存在");
            File uesFile = new File(new StringBuilder(path).append(File.separator).append("ues.txt").toString());
            File cmuFile = new File(new StringBuilder(path).append(File.separator).append("cmu.txt").toString());
            // 创建文件
            uesFile.createNewFile();
            cmuFile.createNewFile();
            File pluginFile = new File(new StringBuilder(path).append(File.separator).append("插件").append(File.separator).append("支付中心").toString());
            pluginFile.mkdirs();
            File[] files = file.listFiles();
            for (File eFile : files) {
                System.out.println(eFile.getName());
                System.out.println(eFile.getAbsolutePath());
            }
        }
        else {
            System.out.println("该目录不存在");
        }
    }
}
