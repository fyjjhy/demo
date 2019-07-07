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
public class ObjectOutputStreamDemo3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = new StringBuilder(CommonConstant.PATH).append(File.separator)
                .append(CommonConstant.TEMP_PATH).append(File.separator)
                .append(CommonConstant.TEMP_SECOND_PATH).append(File.separator)
                .append("ues.txt").toString();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        Student student = new Student("你", 25, 90, "江苏省");
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Student stu = (Student) objectInputStream.readObject();
        System.out.println("name=" + stu.getName() + ", age=" + stu.getAge() + ", score=" + stu.getScore() + ", address=" + stu.getAddress());
    }
}
