package basics;

/**
 * <Description> <br>
 * 【描述】
 * 如果引用类型的成员变量的类是可变的，就必须采取必要的措施来保护该成员变量所引用的对象不会被修改，这样才能创建真正的不可变类。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月01日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class FinalDemo6 {

    private final Name name;

//    public FinalDemo6(Name name) {
//        this.name = new Name(name.getFirstName(), name.getLastName());
//    }


    public FinalDemo6(Name name) {
        this.name = name;
    }

    public FinalDemo6() {
        this.name = new Name();
    }

    public Name getName() {
        return name;
    }

    public static void main(String[] args) {
        Name name = new Name("悟空", "孙");
        FinalDemo6 finalDemo6 = new FinalDemo6(name);
        System.out.println(finalDemo6.getName().getFirstName());
        name.setFirstName("八戒");
        System.out.println(finalDemo6.getName().getFirstName());
    }
}
