//package collection;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
///**
// * <Description> 比较器<br>
// * 【描述】
// * Comparable时排序接口，若一个类实现了Comparable接口，就意味着"该类支持排序"。
// * Comparator是比较器，若需要控制某个类的次序，可以建立一个"该类的比较器"来进行排序。
// * 【比较】
// * Comparable相当于"内部比较器";
// * Comparator相当于"外部比较器".
// * 【原文链接】
// * 1.https://www.cnblogs.com/skywang12345/p/3324788.html
// * 2.
// * 【问题】
// * 1.静态内部类创建对象
// * 【答案】
// * 不依赖外部类的实例，直接实例化内部类
// * 2.System.out.printf("original sort, list:%s\n", list);
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年04月05日 <br>
// * @see collection <br>
// * @since V1.0 <br>
// */
//public class CompareComparatorAndComparableTest {
//
//
//    public static void main(String[] args) {
//        // 新建动态数组
//        List<Person> list = new ArrayList<>();
//        // 添加对象到数组中
//        list.add(new Person("ccc", 20));
//        list.add(new Person("AAA", 30));
//        list.add(new Person("bbb", 10));
//        list.add(new Person("ddd", 40));
//        // 打印list的原始排序
//        System.out.println(list);
//        System.out.printf("original sort, list:%s\n", list);
//        // 对list进行排序
//        Collections.sort(list);
//        System.out.printf("Name sort, list:%s\n", list);
//        // 根据age升序排列
//        Collections.sort(list, new AscAgeComparator());
//        System.out.printf("ASC(age) sort, list:%s\n", list);
//        // 根据age降序排列
//        Collections.sort(list, new DescAgeComparator());
//        System.out.printf("DESC(age) sort, list:%s\n", list);
//
//        // 判断两个Person是否相等
//        testEquals();
//    }
//
//    /**
//     * Description: <br>
//     * 由于Person实现了equals()，若两个对象的age，name都相等，则认为这两个Person相等。
//     * @author 付永杰<br>
//     * @taskId <br>
//     * @param
//     * @return <br>
//     */
//    private static void testEquals() {
//        Person p1 = new Person("eee", 100);
//        Person p2 = new Person("eee", 100);
//        if (p1.equals(p2)) {
//            System.out.printf("%s EQUAL %s\n", p1, p2);
//        }
//        else {
//            System.out.printf("%s NOT EQUAL %s\n", p1, p2);
//        }
//    }
//
//    @Getter
//    @Setter
//    private static class Person implements Comparable<Person> {
//        String name;
//        int age;
//
//        public Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        boolean equals(Person person) {
//            if (this.age == person.age && this.name.equals(person.name)) {
//                return true;
//            }
//            return false;
//        }
//
//        @Override
//        public int compareTo(Person o) {
//            return name.compareTo(o.name);
//        }
//
//        @Override
//        public String toString() {
//            return name + " - " +age;
//        }
//    }
//
//    /**
//     * <Description> 升序比较器<br>
//     *
//     * @author 付永杰<br>
//     * @version 1.0<br>
//     * @taskId <br>
//     * @CreateDate 2019年04月05日 <br>
//     * @see collection <br>
//     * @since V1.0 <br>
//     */
//    private static class AscAgeComparator implements Comparator<Person> {
//
//        @Override
//        public int compare(Person o1, Person o2) {
//            return o1.getAge() - o2.getAge();
//        }
//    }
//
//    /**
//     * <Description> 降序比较器<br>
//     *
//     * @author 付永杰<br>
//     * @version 1.0<br>
//     * @taskId <br>
//     * @CreateDate 2019年04月05日 <br>
//     * @see collection <br>
//     * @since V1.0 <br>
//     */
//    public static class DescAgeComparator implements Comparator<Person> {
//
//        @Override
//        public int compare(Person o1, Person o2) {
//            return o2.getAge() - o1.getAge();
//        }
//    }
//}
