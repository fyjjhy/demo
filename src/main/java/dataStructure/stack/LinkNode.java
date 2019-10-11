package dataStructure.stack;

/**
 * <Description> 链式栈节点（外部类实现，也可以使用内部类）<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see dataStructure.stack <br>
 * @since V1.0 <br>
 */
public class LinkNode<T> {

    // 数据域
    private T data;

    // 指针域
    private LinkNode<T> next;

    // 初始化1
    public LinkNode() {
        this.data = null;
        this.next = null;
    }

    // 初始化2
    public LinkNode(T data) {
        super();
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkNode<T> getNext() {
        return next;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }
}
