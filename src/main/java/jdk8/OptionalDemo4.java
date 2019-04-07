package jdk8;

import entity.User;

import java.util.Optional;

/**
 * <Description> <br>
 * 【链接地址】
 * https://www.cnblogs.com/zhangboyu/p/7580262.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see jdk8 <br>
 * @since V1.0 <br>
 */
public class OptionalDemo4 {

    public static void main(String[] args) {
        User user = null;
        User user1 = new User("john@gmail.com", "1234");
//        User result = Optional.ofNullable(user).orElse(user1);
        User result = Optional.ofNullable(user).orElseGet(() -> user1);
        System.out.println(result.getEmail());
    }
}
