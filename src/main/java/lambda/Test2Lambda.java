package lambda;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月02日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test2Lambda {
    public static void main(String[] args) {
        Test2Lambda test2Lambda = new Test2Lambda();
        Employee[] employees = {
                test2Lambda.new Employee("David"),
                test2Lambda.new Employee("Naveen"),
                test2Lambda.new Employee("Alex"),
                test2Lambda.new Employee("Richard")
        };

        System.out.println("Before Sorting Names: " + Arrays.toString(employees));
        Arrays.sort(employees, test2Lambda.new Employee()::nameCompare);
        System.out.println("After Sorting Names: " + Arrays.toString(employees));
    }

    class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }

        public Employee() {
        }

        public int nameCompare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
