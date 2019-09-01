package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class Predicate_Pattern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(.+)@example.com$");
        List<String> emails = Arrays.asList("alex@example.com", "bob@example.com", "cat@google.com", "david@example.com");
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email);
            }

        }
    }

}
