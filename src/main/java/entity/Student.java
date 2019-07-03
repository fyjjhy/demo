package entity;

import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
public class Student extends Person3 {

    private int score;

    public String name;

    protected int age;

    char sex;

    /** ================构造方法====================== */
    /** 有一个参数的构造方法 */
    public Student(String name) {
        System.out.println("有一个参数的构造方法 s = " + name);
    }

    /** 无参构造方法 */
    public Student() {
        System.out.println("调用了公有、无参构造方法执行...");
    }

    /** 有两个参数的构造方法 */
    public Student(String name, int age) {
        System.out.println("姓名：" + name + ", 年龄：" + age);
    }

    /** 受保护的构造方法 */
    protected Student(boolean n) {
        System.out.println("受保护的构造方法 n = " + n);
    }

    /** 私有的构造方法 */
    private Student(int age) {
        System.out.println("私有的构造方法 年龄：" + age);
    }

    /** 有多个参数的构造方法 */
    public static void main(String[] args) {
        System.out.println("调用：main()...");
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    /**
     * 成员方法
     */

    public void show() {
        System.out.println("is show()...");
    }

    public void show1(String s) {
        System.out.println("调用：共有、String参数的show1(),s = " + s);
    }

    protected void show2() {
        System.out.println("调用：受保护、无参的show2()");
    }

    void show3() {
        System.out.println("调用：默认、无参的show3()");
    }

    private String show4(int age) {
        System.out.println("调用：私有、有返回值、int参数的show4(),age = " + age);
        return age + "";
    }
}
