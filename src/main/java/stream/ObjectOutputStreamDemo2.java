package stream;

import common.CommonConstant;
import entity.Student;

import java.io.*;

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
public class ObjectOutputStreamDemo2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Student student = (Student) objectInputStream.readObject();
        System.out.println("name=" + student.getName() + ", age=" + student.getAge() + ", score=" + student.getScore());
    }
}
