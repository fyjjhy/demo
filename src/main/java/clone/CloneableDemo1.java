package clone;

import java.util.Objects;

/**
 * <Description> Cloneable<br>
 * 【用途】
 * Cloneable是标记型接口，内部都没有方法和属性，实现Cloneable来表示该对象能被克隆，
 * 能使用Object.clone()方法，如果没有实现Cloneable的类，对象调用clone()就会抛出
 * CloneNotSupportedException
 * 【浅克隆】
 * 拷贝对象时仅仅copy对象本身和对象中的基本变量，而不拷贝对象包含的引用指向的对象。
 * 【深克隆】
 * 不仅拷贝对象本身，而且copy对象包含的引用指向的所有对象。
 * 【克隆条件】
 * 1.让类实现java.lang.Cloneable接口；
 * 2.重写Object的clone()方法
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月02日 <br>
 * @see clone <br>
 * @since V1.0 <br>
 */
public class CloneableDemo1 implements Cloneable {

    private int id;

    private String text;

    public CloneableDemo1(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneableDemo1 that = (CloneableDemo1) o;
        return id == that.id &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, text);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableDemo1 cloneableDemo1 = new CloneableDemo1(1, "I am fu");
        CloneableDemo1 cloneableDemo2 = (CloneableDemo1) cloneableDemo1.clone();
        System.out.println(cloneableDemo1.getClass() == cloneableDemo2.getClass());
        System.out.println(cloneableDemo1 == cloneableDemo2);
        System.out.println(cloneableDemo1.equals(cloneableDemo2));
    }
}
