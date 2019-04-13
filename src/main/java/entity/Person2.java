package entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see entity <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class Person2 extends AbstractVo {
    private String name;
    private int age;
    private String nickName;

    public Person2(String name, int age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }

    // 比较方法
//    public boolean equals(Person2 p) {
//        return this.name.equals(p.name) && this.nickName.equals(p.nickName) && this.age == p.age;
//    }

    public boolean equals(Person2 p) {
        return Objects.equals(this.name, p.name) && Objects.equals(this.nickName, p.nickName) && this.age == p.age;
    }
}
