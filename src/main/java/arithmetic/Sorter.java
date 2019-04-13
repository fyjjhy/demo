package arithmetic;

import java.util.Comparator;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see arithmetic <br>
 * @since V1.0 <br>
 */
public interface Sorter {

    /**
     * Description: 排序<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param list 待排序的数组
     * @return <br>
     */
    public <T extends Comparable<T>> void sort(T[] list);

    /**
     * Description: 排序<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param list 待排序的数组
     * @param comparator 比较器
     * @return <br>
     */
    public <T> void sort(T[] list, Comparator<T> comparator);
}
