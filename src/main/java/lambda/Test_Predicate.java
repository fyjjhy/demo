package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Test_Predicate {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        System.out.println("Languages which starts with J :");
        filter(languages, (str)->str.startsWith("J"));
        System.out.println("Languages which ends with a ");
        filter(languages, s -> s.endsWith("a"));
        System.out.println("Print all languages :");
        filter(languages, s -> true);
        System.out.println("Print no language : ");
        filter(languages, s -> false);
        System.out.println("Print language whose length greater than 4:");
        filter(languages, s -> s.length() > 4);
    }

    public static void filter(List<String> list, Predicate<String> condition) {
        list.stream().filter(name -> condition.test(name)).forEach(System.out::println);
    }

//    public static void filter(List<String> list, Predicate<String> condition) {
//        for (String name: list) {
//            if (condition.test(name)) {
//                System.out.println(name + " ");
//            }
//        }
//    }
}
