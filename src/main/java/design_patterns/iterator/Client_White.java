package design_patterns.iterator;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月20日 <br>
 * @see design_patterns.iterator <br>
 * @since V1.0 <br>
 */
public class Client_White {

    public static void main(String[] args) {
        Object[] objArray = { "One","Two","Three","Four","Five","Six" };
        // 创建聚合对象
        Aggregate_White agg = new ConcreteAggregate_White(objArray);
        // 循环输出聚合对象中的值
        Iterator_White it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
