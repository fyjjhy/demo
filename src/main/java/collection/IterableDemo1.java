package collection;

/**
 * <Description> Iterable<br>
 *【需求】
 * 是如何在自定义的数据结构或者说对象容器上使用增强型for循环
 * 让自定义的数据结构实现Iterable<T>接口
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月11日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class IterableDemo1 {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.getEntries().add(new MyList.Entry(1, "zhang"));
        myList.getEntries().add(new MyList.Entry(2, "liu"));
        for (MyList.Entry entry : myList) {
            System.out.println(entry.getId() + ":" +entry.getName());
        }
    }
}
