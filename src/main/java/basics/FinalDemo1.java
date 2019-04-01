package basics;

/**
 * <Description> final修饰符<br>
 * 【修饰】
 * 类
 * 变量
 *    由程序员显式地指定初始值
 *    类变量：必须在声明类变量时或静态代码块中指定初始值。
 *    实例变量：必须在声明实例变量时，非静态初始化块或构造器中指定初始值。
 *    如果打算在构造器、初始化块中对成员变量进行初始化，则不要再初始化前就访问成员变量的值。
 *  局部变量
 *    必须由程序员指定默认值。既可以在定义时指定默认值，也可以不指定默认值。
 *  基本数据类型变量
 *    保证变量的基本数值不会改变.
 *  引用类型变量
 *    只保证变量引用的地址不会改变，即一直引用一个对象。
 * 方法
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月01日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class FinalDemo1 {
//    final int age;

    public void setAge() {
        final int a;
        a = 3;
        System.out.println(a);
    }
    public static void main(String[] args) {
//        System.out.println(age);
//        age = 6;
//        System.out.println(age);
    }
}
