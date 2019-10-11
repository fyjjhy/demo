package dataStructure.stack;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see dataStructure.stack <br>
 * @since V1.0 <br>
 */
public class LinkStackTest {
    public static void main(String[] args) {
        LinkStack<Character> link = new LinkStack<>();

        // 状态
        System.out.println("栈是否为空："+link.isNull());

        // 操作
        // 一次压栈
        link.push(new LinkNode<Character>('a'));
        link.push(new LinkNode<Character>('b'));
        link.push(new LinkNode<Character>('c'));

        // 一次弹栈
        System.out.println("弹栈顺序：");
        System.out.println(link.pop().getData());
        System.out.println(link.pop().getData());
        System.out.println(link.pop().getData());
    }
}
