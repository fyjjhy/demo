package dataStructure.sort;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * <Description> 快速排序<br>
 * 1.从数列中挑出一个元素，称为"基准"。
 * 2.重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面(相同的数可以到任意一边)。
 * 在这个分区结束后，该基准就处于数列的中间位置。这个称为分区操作。
 * 3.递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * 递归到最底部时，数列的大小是零或一，也就是已经排序好了。这个算法一定会结束，因为在每次迭代中，
 * 它至少会把一个元素摆到它最后的位置去。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月20日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Description: <br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param arr 待排序数组
     * @param low 左边界
     * @param high 右边界
     * @return <br>
     */
    private static void quickSort(int[] arr, int low, int high) {
        if(arr.length <= 0) return;
        if(low >= high) return;
        int left = low;
        int right = high;

        // 挖坑1：保存基准的值
        int temp = arr[left];
        System.out.println("基准的值: " + temp);
        while (left < right){
            // 坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
            while(left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];
            System.out.println("坑1:" + Arrays.toString(arr));
            // 坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
            while(left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
            System.out.println("坑2:" + Arrays.toString(arr));
        }
        // 基准值填补到坑3中，准备分治递归快排
        arr[left] = temp;
        System.out.println("坑3:" + Arrays.toString(arr));
        System.out.println("Sorting: " + Arrays.toString(arr));
        quickSort(arr, low, left-1);
        quickSort(arr, left+1, high);
    }
}
