package immutable;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * <Description> 不可变对象<br>
 *【概念】
 * [不可变对象]
 * 对象一旦被创建它的状态(对象的数据，也即对象属性值)就不能改变，任何对它的改变都应该产生一个新的对象。
 * [可变对象]
 * 相对于不可变类，可变类创建实例后可以改变其成员变量值。
 * 【编写不可变类】
 * 1.确保类不能被继承
 *  将类声明为final，或者使用静态工厂并声明构造器为private，如果类可以被继承会破坏类的不可变性机制，
 *  只要继承类覆盖父类的方法并且继承类可以改变成员变量值，那么一旦子类以父类的形式出现时，
 *  不能保证当前类是否可变。
 * 2.使用private和final修饰符来修饰该类的属性
 *  注：
 *  如果成员变量为可变对象属性，不要使这些对象改变。
 *    不要提供更改可变对象的方法
 *    不要共享对可变对象的引用，不要存储传给构造器的外部可变对象的引用。因为引用可变对象的成员变量和外部可变对象的引用
 *    指向同一块内存地址，可以在不可变类之外通过修改可变对象的值
 * 3.不要提供任何可以修改对象状态的方法(不仅仅是set方法，还有任何其他可以改变状态的方法)
 * 【不可变对象的优缺点】
 * 【优点】
 * 构造、测试、使用都很简单
 * 不可变对象是线程安全的，在线程之间可以相互共享
 * 不可变对象可以重复使用，可以将它们缓存起来重复使用，就像字符串字面量和整型数字一样。
 * 可以使用静态工厂方法提供类似于valueOf()这样的方法，可以从缓存中返回一个已经存在的Immutable对象，而不是重新创建一个。
 *【缺点】
 * 最大缺点是创建对象的开销
 * 【链接地址】
 * https://blog.csdn.net/bupa900318/article/details/80696785
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see immutable <br>
 * @since V1.0 <br>
 */
public class ImmutableDemo1 {

    private final int[] myArray;

    public ImmutableDemo1(int[] myArray) {
        this.myArray = myArray;
    }

    public static void main(String[] args) {
        ImmutableDemo1 immutableDemo1 = new ImmutableDemo1(new int[]{1, 2, 3});
        // 打印数组元素
        System.out.println(Arrays.toString(immutableDemo1.myArray));
    }
}
