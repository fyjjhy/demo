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
public class SqStackTest {
    public static void main(String[] args) {
        // 初始化栈(char类型)
        SqStack<Character> stack = new SqStack<>(10);

        // 2状态
        System.out.println("栈是否为空："+stack.isNull());
        System.out.println("栈是否已满："+stack.isFull());

        // 2操作
        // 一次压栈
        stack.push('a');
        stack.push('b');
        stack.push('c');

        // 一次弹栈
        System.out.println("弹栈顺序：");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
