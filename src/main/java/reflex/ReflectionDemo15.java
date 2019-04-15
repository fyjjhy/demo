package reflex;

import dao.DAO;
import dao.PersonDAO;
import entity.Person3;

/**
 * <Description> 反射与泛型<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月15日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo15 {

    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        Person3 entity = new Person3();
        // 调用父类的save方法，同时也把Person这个实参传给父类的T
        personDAO.save(entity);
        Person3 person3 = (Person3) personDAO.get(1);
        System.out.println(person3);

    }
}
