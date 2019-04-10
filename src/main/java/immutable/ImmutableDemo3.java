package immutable;

import DateUtil.DateUtil;

import java.util.Date;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see immutable <br>
 * @since V1.0 <br>
 */
public class ImmutableDemo3 {

    // 声明为final的基本类型数据总是不可变的
    private final double fMass;

    // 不可变的对象属性(String对象不可变)
    private final String fName;

    // 可变对象的属性，因为可变属性只能被这个类改变，采用深度拷贝方法来复制一个对象并传入副本的引用
    private final Date fDateOfDiscovery;

    public ImmutableDemo3(double fMass, String fName, Date aDateOfDiscovery) {
        this.fMass = fMass;
        this.fName = fName;
        // 创建aDateOfDiscovery的一个私有拷贝
        // 这是保持fDateOfDiscovery属性为private的唯一方式，并且保护这个类不受调用者对原始aDateOfDiscovery
        // 对象所做任何改变的影响
        this.fDateOfDiscovery = new Date(aDateOfDiscovery.getTime());
    }

    // 返回一个基本类型
    public double getfMass() {
        return fMass;
    }

    // 调用者得到内部属性的一个直接引用，由于String是不可变的所以没有影响
    public String getfName() {
        return fName;
    }

    // 返回一个可变对象的一个保护性拷贝，调用者可以任意改变返回的Date对象，但是不会影响
    // 类的内部，因为没有fDate的一个引用，更准确的说，使用的是和fDate有着相同数据的另一个Date对象
    public Date getfDateOfDiscovery() {
        return new Date(fDateOfDiscovery.getTime());
    }

    public static void main(String[] args) {
        ImmutableDemo3 immutableDemo3 = new ImmutableDemo3(1.0D, "earch", DateUtil.getCurrentDate());
        Date date = immutableDemo3.getfDateOfDiscovery();
        date.setTime(111111111L);
        System.out.println("the value of fDateOfDiscovery of internal class:"+immutableDemo3.fDateOfDiscovery.getTime());
        System.out.println("the value of date after change its value:"+date.getTime());
    }
}
