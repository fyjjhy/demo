package arithmetic;

import java.util.Comparator;

/**
 * <Description> 冒泡排序<br>
 *【定义】
 * 相邻的元素两两比较，根据大小来交换元素的位置。
 *【链接地址】
 * https://www.sohu.com/a/241420723_684445
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see arithmetic <br>
 * @since V1.0 <br>
 */
public class BubbleSorterDemo1 implements Sorter {

    public static void main(String[] args) {

    }

    @Override
    public <T extends Comparable<T>> void sort(T[] list) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len -i; ++j) {
                if (list[j].compareTo(list[j+1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }

    @Override
    public <T> void sort(T[] list, Comparator<T> comparator) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len - i; ++j) {
                if (comparator.compare(list[j], list[j+1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
