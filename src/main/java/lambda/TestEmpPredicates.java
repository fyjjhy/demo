package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class TestEmpPredicates {
    public static void main(String[] args) {
        Emp e1 = new Emp(1,23,"M","Rick","Beethovan");
        Emp e2 = new Emp(2,13,"F","Martina","Hengis");
        Emp e3 = new Emp(3,43,"M","Ricky","Martin");
        Emp e4 = new Emp(4,26,"M","Jon","Lowman");
        Emp e5 = new Emp(5,19,"F","Cristine","Maria");
        Emp e6 = new Emp(6,15,"M","David","Feezor");
        Emp e7 = new Emp(7,68,"F","Melissa","Roy");
        Emp e8 = new Emp(8,79,"M","Alex","Gussin");
        Emp e9 = new Emp(9,15,"F","Neetu","Singh");
        Emp e10 = new Emp(10,45,"M","Naveen","Jain");
        List<Emp> emps = new ArrayList<>();
        emps.addAll(Arrays.asList(new Emp[]{e1, e2, e3, e4, e5, e6, e7, e8, e9, e10}));
        System.out.println(EmpPredicates.filterEmps(emps, EmpPredicates.isAdultMale()));
        System.out.println(EmpPredicates.filterEmps(emps, EmpPredicates.isAdultFemale()));
        System.out.println(EmpPredicates.filterEmps(emps, EmpPredicates.isAgeMoreThan(35)));
        System.out.println(EmpPredicates.filterEmps(emps, EmpPredicates.isAgeMoreThan(35).negate()));
    }
}
