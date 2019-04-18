package collection;

import entity.Person;

import java.util.ArrayList;
import java.util.Iterator;
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
public class IteratorDemo5 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("fu", 29));
        list.add(new Person("sun", 32));
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if ("fu".equals(person.getName())) {
                person.setName("fuyongjie");
            }
        }
        System.out.println(list.toString());
    }
}
