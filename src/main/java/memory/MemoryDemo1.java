package memory;

import entity.Person;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月09日 <br>
 * @see memory <br>
 * @since V1.0 <br>
 */
public class MemoryDemo1 {

    public static void main(String[] args) {
        //局部变量p和形参args都在main方法的栈帧中
        // new Person()对象在堆中分配空间
        Person p = new Person("今天", 29);
        //sum在栈中，new int[10}在堆中分配空间
        int[] sum = new int[10];
    }
}
