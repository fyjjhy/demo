package design_patterns.iterator;

/**
 * <Description> 具体聚集角色类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月20日 <br>
 * @see design_patterns.iterator <br>
 * @since V1.0 <br>
 */
public class ConcreteAggregate_White extends Aggregate_White {

    private Object[] objArray = null;

    public ConcreteAggregate_White(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    Iterator_White createIterator() {
        return new ConcreteIterator_White(this);
    }

    // 取值方法：向外界提供聚集元素
    public Object getElement(int index) {
        if (index < objArray.length) {
            return objArray[index];
        }
        return null;
    }

    // 取值方法：向外界提供聚集的大小
    public int size() {
        return objArray.length;
    }
}
