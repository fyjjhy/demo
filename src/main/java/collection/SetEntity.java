package collection;

import java.util.Objects;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月30日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class SetEntity {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SetEntity entity = (SetEntity) o;
//        return Objects.equals(name, entity.name) &&
//                Objects.equals(age, entity.age);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(name, age);
//    }

    @Override
    public String toString() {
        return "SetEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
