package jdk8;

import entity.User;

import java.util.Optional;

/**
 * <Description> Optional<br>
 * 【主要解决的问题】
 * 空指针异常
 * 【本质】
 * 这是一个包含有可选值的包装类，Optional类既可以含有对象也可以为空
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see jdk8 <br>
 * @since V1.0 <br>
 */
public class OptionalDemo1 {

    public static void main(String[] args) {

        Optional<User> optional = Optional.empty();
        System.out.println(optional.get());
    }
}
