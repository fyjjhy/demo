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
@Setter
@Getter
public class Address extends AbstractVo {

    private Country country;
}
