package entity;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see entity <br>
 * @since V1.0 <br>
 */
@Setter
@Getter
public class Person3 extends AbstractVo {
    private static final long serialVersionUID = -7453605133343315482L;
    String name;
    private int age;

    public Person3(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person3() {
        super();
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void test(String name,Integer age){
        System.out.println("调用成功");
    }
}
