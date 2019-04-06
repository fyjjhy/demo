package collection;

/**
 * <Description> HashSet<br>
 * 【特点】
 * 1.不能保证元素的排列顺序
 * 2.不是同步的
 * 3.集合元素可以是null，但只能放入一个null
 * 【存放特性】
 * 当向HashSet集合中存入一个元素时，HashSet会调用该对象的hashCode()方法来得到该对象的hashCode值，
 * 然后根据hashCode值来决定该对象在HashSet中存储位置。
 * 【实现】
 * HashSet是哈希表实现的，HashSet中的数据是无序的，可以放入null，但是只能放入一个null，值不能重复。
 * 【链接】
 * https://www.cnblogs.com/smiles125/p/5370204.html
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月06日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class HashSetDemo1 {

    public static void main(String[] args) {

    }
}
