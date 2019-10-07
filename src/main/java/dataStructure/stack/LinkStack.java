package dataStructure.stack;

/**
 * <Description> <br>
 * 链栈(LinkStack)用链表来实现，主要有四个元素：2状态2操作。
 * 2状态：栈空？；栈满（逻辑上永远都不会栈满，除非你的电脑没内存了^_^）。
 * 2操作：压栈push；弹栈pop。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see dataStructure.stack <br>
 * @since V1.0 <br>
 */
public class LinkStack<T> {

    // 栈顶节点
    private LinkNode<T> top;

    // 初始化1
    public LinkStack() {
        this.top = new LinkNode<T>();
    }

    // 初始化栈
    public void initStack() {
        this.top.setData(null);
        this.top.setNext(null);
    }

    // 是否栈空
    public boolean isNull() {
        boolean flag = top.getNext() == null ? true : false;
        return flag;
    }

    // 压栈
    public void push(LinkNode<T> node) {
        if (isNull()) {
            // 栈空，即第一次插入
            top.setNext(node);
            // 首次插入的元素位栈底元素
            node.setNext(null);
        }
        else {
            node.setNext(top.getNext());
            top.setNext(node);
        }
    }

    // 弹栈
    public LinkNode<T> pop() {
        if (isNull()) {
            // 栈空无法弹栈
            return null;
        }
        else {
            // 取出删除节点
            LinkNode<T> delNode = top.getNext();
            // 删除节点
            top.setNext(top.getNext().getNext());
            return delNode;
        }
    }
}
