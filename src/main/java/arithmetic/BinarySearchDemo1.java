package arithmetic;

import java.util.Comparator;

/**
 * <Description> 折半查找(二分查找)<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see arithmetic <br>
 * @since V1.0 <br>
 */
public class BinarySearchDemo1 {

    public static <T extends Comparable<T>> int binarySearch(T[] x, T key) {
        return binarySearch(x, 0, x.length - 1, key);
    }

    public static void main(String[] args) {
        int low = 0;
        int high = 9;
        System.out.println((low + high) >>> 1); // 逻辑右移，是不带符号位的右移
        System.out.println(Integer.toBinaryString((low + high)));
        int mid = low + (high - low) >> 1;
        System.out.println(mid);
        System.out.println(high - low >> 1);
    }

    // 使用循环实现二分查找
    private static <T> int binarySearch(T[] x, T key, Comparator<T> comparator) {
        int low = 0;
        int high = x.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int comResult = comparator.compare(x[mid], key);
            if (comResult < 0) {
                low = mid + 1;
            }
            else if (comResult > 0) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    // 使用递归实现的二分查找
    private static <T extends Comparable<T>> int binarySearch(T[] x, int low, int high, T key) {
        if (low <= high) {
            int mid = low + (high - low) >> 1;
            if (key.compareTo(x[mid]) == 0) {
                return mid;
            }
            else if (key.compareTo(x[mid]) < 0) {
                return binarySearch(x, low, mid - 1, key);
            }
            else {
                return binarySearch(x, mid + 1, high, key);
            }
        }
        return -1;
    }
}
