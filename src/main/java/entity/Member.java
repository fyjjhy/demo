package entity;

import annotation.Constraints;
import annotation.DBTable;
import annotation.SQLInteger;
import annotation.SQLString;
import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/7/3
 * @see entity <br>
 * @since V1.0<br>
 */
@Getter
@Setter
@DBTable(name = "MEMBER")
public class Member {

    @SQLString(name = "ID", value = 50, constraint = @Constraints(primaryKey = true, allowNull = true))
    private String id;

    @SQLString(name = "NAME", value = 30, constraint = @Constraints(allowNull = true))
    private String name;

    @SQLInteger(name = "AGE", constraint = @Constraints(allowNull = true))
    private int age;

    @SQLString(name = "DESCRIPTION", value = 150)
    private String description;

}
