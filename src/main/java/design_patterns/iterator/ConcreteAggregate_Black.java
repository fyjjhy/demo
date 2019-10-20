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
public class ConcreteAggregate_Black extends Aggregate_Black {

    private Object[] objArray = null;

    public ConcreteAggregate_Black(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    Iterator_Black createIterator() {
        return new ConcreteIterator_Black();
    }

    private class ConcreteIterator_Black implements Iterator_Black {

        // 内部索引，记录当前迭代到的索引位置
        private int index = 0;

        // 记录当前聚集对象的大小
        private int size = 0;

        public ConcreteIterator_Black() {
            this.size = objArray.length;
            index = 0;
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
            return objArray[index];
        }
    }
}
