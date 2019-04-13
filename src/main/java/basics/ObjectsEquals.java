package basics;

import entity.Person2;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class ObjectsEquals {

    public static void main(String[] args) {
        Person2 person1 = new Person2("张三", 14, null);
        Person2 person2 = new Person2("张三", 14, null);
        if (person1.equals(person2)) {
            System.out.println("一样");
        }
        else {
            System.out.println("不一样");
        }
    }
}
