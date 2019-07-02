package reflex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月02日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionPropertiesDemo1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取Class对象
        Class clazz = Class.forName(getValue("className"));

        // 2.获取show()
        Method method = clazz.getMethod(getValue("methodName"));

        // 3.调用show()
        method.invoke(clazz.getConstructor().newInstance());
    }

    public static String getValue(String key) throws IOException {
        Properties properties = new Properties();
        String path = new StringBuilder().append("D:").append(File.separator)
                .append("project").append(File.separator)
                .append("demo").append(File.separator)
                .append("src").append(File.separator)
                .append("main").append(File.separator)
                .append("java").append(File.separator)
                .append("reflex").append(File.separator)
                .append("pro.txt").toString();
        // 使用资源定位方法，确认文件路径
        // FileReader fileReader = new FileReader(ReflectionPropertiesDemo1.class.getResource("pro.txt").getPath());
        // FileReader fileReader = new FileReader(path);
        FileReader fileReader = new FileReader("src/main/java/reflex/pro.txt");
        properties.load(fileReader);
        fileReader.close();
        return properties.getProperty(key);
    }
}
