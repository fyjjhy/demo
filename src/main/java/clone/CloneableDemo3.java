package clone;

import java.util.Objects;

/**
 * <Description> 深克隆<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月02日 <br>
 * @see clone <br>
 * @since V1.0 <br>
 */
public class CloneableDemo3 implements Cloneable {

    private String path;

    private CloneableDemo1 cloneableDemo1;

    public CloneableDemo3(String path, CloneableDemo1 cloneableDemo1) {
        this.path = path;
        this.cloneableDemo1 = cloneableDemo1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneableDemo3 that = (CloneableDemo3) o;
        return Objects.equals(path, that.path) &&
                Objects.equals(cloneableDemo1, that.cloneableDemo1);
    }

    @Override
    public int hashCode() {

        return Objects.hash(path, cloneableDemo1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneableDemo3 cloneableDemo3 = (CloneableDemo3) super.clone();
        cloneableDemo3.cloneableDemo1 = (CloneableDemo1) cloneableDemo3.cloneableDemo1.clone();
        return cloneableDemo3;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableDemo1 info = new CloneableDemo1(2, "Hello world.");

        CloneableDemo3 file1 = new CloneableDemo3("c:", info);

        CloneableDemo3 file2 = (CloneableDemo3) file1.clone();



        System.out.println(file1.getClass() == file2.getClass());//true

        System.out.println(file1 == file2);//false

        System.out.println(file1.equals(file2));//true

        System.out.println(file1.cloneableDemo1.getClass() == file2.cloneableDemo1.getClass());//true

        System.out.println(file1.cloneableDemo1 == file2.cloneableDemo1);//false

        System.out.println(file1.cloneableDemo1.equals(file2.cloneableDemo1));//true
    }
}
