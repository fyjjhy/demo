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
public class OptionalDemo2 {

    public static void main(String[] args) {
//        Optional<User> optional = Optional.of(null);
//        Optional<User> optional = Optional.ofNullable(null);
        // 从Optional实例中取回实际值对象的方法之一--get()
//        String name = "John";
        String name = null;
        Optional<String> optional = Optional.ofNullable(name); // name为null时抛出异常
        // 为了避免异常，可以选择首先验证是否有值
        optional.isPresent();
        System.out.println(optional.get());
    }
}
