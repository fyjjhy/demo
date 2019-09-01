package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月01日 <br>
 * @see lambda <br>
 * @since V1.0 <br>
 */
public class Trans_Predicate {
    public static void main(String[] args) {
        // Compile regex as predicate
        Predicate<String> emailFilter = Pattern.compile("^(.+)@example.com").asPredicate();
        // Input list
        List<String> emails = Arrays.asList("alex@example.com", "bob@example.com", "cat@google.com", "david@example.com");
        // Apply predicate filter
        List<String> desiredEmails = emails.stream().filter(emailFilter).collect(Collectors.toList());
        // Now perform desired operation
        desiredEmails.forEach(System.out::println);
    }
}
