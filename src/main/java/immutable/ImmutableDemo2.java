package immutable;

/**
 * <Description> <br>
 *【描述】
 * 为了保证内部的值不被修改，可以采用深拷贝的方法来复制一个对象并传入副本的引用来确保类的不可变
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see immutable <br>
 * @since V1.0 <br>
 */
public class ImmutableDemo2 {

    private final int[] myArray;

    public ImmutableDemo2(int[] myArray) {
        this.myArray = myArray.clone(); // 深拷贝
    }

    public static void main(String[] args) {

    }
}
