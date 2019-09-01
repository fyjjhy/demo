package lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月31日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class EmpPredicates {

    public static Predicate<Emp> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Emp> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Emp> isAgeMoreThan(Integer age) {
        return p-> p.getAge() > age;
    }

    public static List<Emp> filterEmps(List<Emp> emps, Predicate<Emp> predicate) {
        return emps.stream().filter(predicate).collect(Collectors.toList());
    }
}
