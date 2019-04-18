package reflex;

import java.io.IOException;
import java.io.InputStream;

/**
 * <Description> 使用类加载器获取当前目录下的文件<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo6 {

    public static void main(String[] args) throws IOException {
        ReflectionDemo6 reflectionDemo6 = new ReflectionDemo6();
        reflectionDemo6.file();
    }

    public String file() throws IOException {
        // src目录下，直接加载
        // String file = IOUtil.readFile(ReflectionDemo6.class.getClassLoader().getResource("reflex.ReflectionDemo6").getPath());

        // 放在内部文件夹，要写全路径
        InputStream inputStream = this.getClass().getResourceAsStream("reflex.ReflectionDemo6.java");
        System.out.println(inputStream);
        return null;
    }
}
