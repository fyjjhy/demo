package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 选择排序<br>
 * 1.从待排序序列中，找到最小的元素
 * 2.如果最小元素不是待排序序列的第一个元素，将其和第一个元素交换
 * 3.从余下的N-1个元素中，找出最小的元素，重复1，2步，直到排序结束
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月10日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
