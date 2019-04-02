package clone;

import java.util.Objects;

/**
 * <Description> 浅克隆<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月02日 <br>
 * @see clone <br>
 * @since V1.0 <br>
 */
public class CloneableDemo2 implements Cloneable {

    private String path;

    private CloneableDemo1 cloneableDemo1;

    public CloneableDemo2(String path, CloneableDemo1 cloneableDemo1) {
        this.path = path;
        this.cloneableDemo1 = cloneableDemo1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneableDemo2 that = (CloneableDemo2) o;
        return Objects.equals(path, that.path) &&
                Objects.equals(cloneableDemo1, that.cloneableDemo1);
    }

    @Override
    public int hashCode() {

        return Objects.hash(path, cloneableDemo1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableDemo1 cloneableDemo1 = new CloneableDemo1(2, "hello world");
        CloneableDemo2 cloneableDemo2 = new CloneableDemo2("c:", cloneableDemo1);
        CloneableDemo2 cloneableDemo3 = (CloneableDemo2) cloneableDemo2.clone();
        System.out.println(cloneableDemo2.getClass() == cloneableDemo3.getClass());
        System.out.println(cloneableDemo2 == cloneableDemo3);
        System.out.println(cloneableDemo2.equals(cloneableDemo3));
        System.out.println(cloneableDemo2.cloneableDemo1.getClass() == cloneableDemo3.cloneableDemo1.getClass());
        System.out.println(cloneableDemo2.cloneableDemo1 == cloneableDemo3.cloneableDemo1);
        System.out.println(cloneableDemo2.cloneableDemo1.equals(cloneableDemo3.cloneableDemo1));
    }
}
