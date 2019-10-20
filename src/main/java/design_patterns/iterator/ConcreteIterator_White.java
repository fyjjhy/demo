package design_patterns.iterator;

/**
 * <Description> 具体迭代子角色类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月20日 <br>
 * @see design_patterns.iterator <br>
 * @since V1.0 <br>
 */
public class ConcreteIterator_White implements Iterator_White{

    // 持有被迭代的具体的聚合对象
    private ConcreteAggregate_White agg;

    // 内部索引，记录当前迭代到的索引位置
    private int index = 0;

    // 记录当前聚集对象的大小
    private int size = 0;

    public ConcreteIterator_White(ConcreteAggregate_White agg) {
        this.agg = agg;
        this.index = 0;
        this.size = agg.size();
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return index >= size;
    }

    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }
}
