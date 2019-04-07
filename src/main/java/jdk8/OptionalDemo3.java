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
public class OptionalDemo3 {

    public static void main(String[] args) {
        User user = new User("john@gmail.com", "1234");
        Optional<User> optional = Optional.ofNullable(user);
//        optional.isPresent();
        optional.ifPresent(u -> System.out.println(u.getEmail().equals(user.getEmail())));
        System.out.println(user.getEmail().equals(optional.get().getEmail()));
    }
}
