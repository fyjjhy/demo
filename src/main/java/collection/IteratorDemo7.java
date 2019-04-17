package collection;

import entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
public class IteratorDemo7 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("1", 1));
        list.add(new Person("2", 1));
        list.add(new Person("3", 1));
        list.add(new Person("4", 1));

        System.out.println("原始数据=" + list.toString());

        ListIterator<Person> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            Person person = listIterator.next();
            if("1".equals(person.getName())) {
                person.setAge(11);
               listIterator.add(new Person("11", 11));
            }
            if("2".equals(person.getName())) {
                listIterator.remove();
            }
        }

        System.out.println("\n修改后正向遍历：" + list.toString());

        System.out.println("\n修改后反向遍历：");
        //反向遍历
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex() + ": "+listIterator.previous().toString());
        }
    }
}
