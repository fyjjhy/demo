package entity;

import lombok.Getter;
import lombok.Setter;

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
public class Student extends Person3 {

    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}
