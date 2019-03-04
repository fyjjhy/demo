package inner;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see inner <br>
 * @since V1.0 <br>
 */
public class TestOuterClass {

    private static int a;

    private int b;

    public static void test() {
        System.out.println("TestOuterClass static function");
    }

    public static void main(String[] args) {
        // new一个外部类
        TestOuterClass outerClass = new TestOuterClass();
        // 通过外部类的对象new一个非静态的内部类
        TestOuterClass.InnerClass no_static_inner = outerClass.new InnerClass();
        // 调用非静态内部类的方法
        System.out.println("调用非静态内部类的方法" + no_static_inner.getKey());

        // 调用静态内部类的静态变量
        System.out.println("调用静态内部类的静态变量" + TestOuterClass.InnerStaticClass.STATIC_VALUE);
        // 不依赖外部类实例，直接实例化静态内部类
        TestOuterClass.InnerStaticClass static_inner = new TestOuterClass.InnerStaticClass();
        // 调用静态内部类的非静态方法
        System.out.println("调用静态内部类的非静态方法" + static_inner.getValue());
        // 调用静态内部类的静态方法
        System.out.println("调用静态内部类的静态方法" + InnerStaticClass.getMessage());
    }

    private class InnerClass {
        // 只有在静态内部类中才能定义静态成员
        // private static String tt = 0;
        private int flag = 0;

        public InnerClass() {
            // 非静态内部类的非静态成员可以访问外部类的非静态变量和静态变量
            System.out.println("InnerClass call OuterClass static variable a=" + TestOuterClass.this.a);
            System.out.println("InnerClass call OuterClass variable b=" + b);
            System.out.println("InnerClass variable flag=" + flag);
            // 调用外部类的静态方法
            System.out.println("InnerClass call outerClass static function");
            test();
        }

        public String getKey() {
            return "no-static-inner";
        }
    }

    private static class InnerStaticClass {
        // 静态内部类可以有静态成员，而非静态内部类不能有静态成员
        private static String STATIC_VALUE = "0";

        private int flag = 0;

        public InnerStaticClass() {
            System.out.println("InnerStaticClass call OuterClass static variable a=" + a);
            // System.out.println("InnerStaticClass call OuterClass b=" + b);
            System.out.println("InnerStaticClass variable flag =" + flag);
            System.out.println("InnerStaticClass static variable STATIC_VALUE=" + STATIC_VALUE);
        }

        public int getValue() {
            // 静态内部类访问外部类的静态方法
            test();
            return 1;
        }

        public static String getMessage() {
            return "static-inner";
        }
    }

    public TestOuterClass() {
        // new一个非静态的内部类
        InnerClass innerClass = new InnerClass();
        System.out.println("OuterClass create");
    }
}
