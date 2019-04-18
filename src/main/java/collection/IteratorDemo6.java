package collection;

import entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月17日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class IteratorDemo6 {

    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Person("1", 1));
        list.add(new Person("2", 2));
        list.add(new Person("3", 3));
        // lambda expression
        list.removeIf(person->(person.getAge() < 2));
        System.out.println(list);
    }
}
