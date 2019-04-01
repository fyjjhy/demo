package basics;

import java.util.Objects;

/**
 * <Description> 不可变类<br>
 * 【描述】
 * 创建该类的实例后，该实例的实例变量是不可改变的。
 * 创建自定义的不可变类
 * 【规则】
 * 1.使用private和final修饰符来修饰该类的成员变量
 * 2.提供带参数的构造器，用于根据传入参数初始化类中的成员变量
 * 3.仅为类的成员变量提供getter方法，不提供setter方法
 * 4.如果有必要，重写Object类的equals()方法和hashCode()方法。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月01日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class FinalDemo5 {

    private final String detail;

    private final String postCode;

    public FinalDemo5(String detail, String postCode) {
        this.detail = detail;
        this.postCode = postCode;
    }

    public FinalDemo5() {
        this.detail = "";
        this.postCode = "";
    }

    public String getDetail() {
        return detail;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinalDemo5 that = (FinalDemo5) o;
        return Objects.equals(detail, that.detail) &&
                Objects.equals(postCode, that.postCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(detail, postCode);
    }

    public static void main(String[] args) {

    }
}
