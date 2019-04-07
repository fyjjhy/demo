package entity;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月07日 <br>
 * @see entity <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class User extends AbstractVo {

    private Address address;

    private String email;

    private String name;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }
}
