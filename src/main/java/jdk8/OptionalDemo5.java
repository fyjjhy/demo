package jdk8;

import entity.User;

import java.util.Optional;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see jdk8 <br>
 * @since V1.0 <br>
 */
public class OptionalDemo5 {

    public static void main(String[] args) {
        User user = new User("john@gmail.com", "1234");
        User user1 = new User("anno@gmail.com", "1234");
        User result = Optional.ofNullable(user).orElse(user1);
        System.out.println(result.getEmail());
    }
}
