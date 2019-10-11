package dataStructure.stack;

/**
 * <Description> <br>
 * 顺序栈(SqStack)一般用数组来实现，主要有4个元素：2状态2操作
 * 2状态：栈空？；栈满？
 * 2操作：压栈|push；弹栈|pop
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see dataStructure.stack <br>
 * @since V1.0 <br>
 */
public class SqStack<T> {

    // 用数组表示栈元素
    private T data[];

    // 栈空间大小(常量)
    private int maxSize;

    // 栈顶指针(指向栈顶元素)
    private int top;

    public SqStack(int maxSize) {
        this.maxSize = maxSize;
        // 泛型数组不能直接new创建，需要使用Object来创建(其实一开始也可以直接使用Object来代替泛型)
        this.data = (T[]) new Object[maxSize];
        this.top = -1;
    }

    // 判断栈是否为空
    public boolean isNull() {
        boolean flag = this.top <= -1 ? true : false;
        return flag;
    }

    // 判断是否栈满
    public boolean isFull() {
        boolean flag = this.top == this.maxSize -1 ? true : false;
        return flag;
    }

    // 压栈
    public boolean push(T value) {
        if (isFull()) {
            // 栈满
            return false;
        }
        else {
            // 栈顶指针加1并赋值
            data[++top] = value;
            return true;
        }
    }

    public T pop() {
        if (isNull()) {
            // 栈为空
            return null;
        }
        else {
            // 取出栈顶元素
            T value = data[top];
            // 栈顶指针-1
            --top;
            return value;
        }
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
