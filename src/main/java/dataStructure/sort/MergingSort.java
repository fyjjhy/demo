package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 归并排序算法<br>
 * 归并排序可通过两种方式实现：
 * 自上而下的递归
 * 递归法(假设序列共有n个元素)
 * 1.将序列每相邻两个数字进行归并操作，形成floor(n/2)个序列，排序后每个序列包含两个元素
 * 2.将上述序列再次归并，形成floor(n/4)个序列，每个序列包含4个元素
 * 3.重复步骤2，直到所有元素排序完毕。
 * 自下而上的迭代
 * 迭代法
 * 1.
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月19日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class MergingSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(arr.length);
        mergingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergingSort(int[] arr) {
        int len = arr.length;
        int base = 2;
        for (int i = 0; i < (len / base); i++) {
            for (int j = 0; j < len; j++) {
                if (j % base == 0 && j < len - 1) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            base *= 2;
        }
    }
}
