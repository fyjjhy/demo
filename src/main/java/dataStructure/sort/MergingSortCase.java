package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 归并排序算法案例<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月19日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class MergingSortCase {
    public static void main(String[] args) {
        int[] arr = {3, 40, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        arr = mergingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergingSort(int[] arr) {
        if(arr.length <= 1) return arr;

        int num = arr.length >> 1;
        int[] leftArr = Arrays.copyOfRange(arr, 0, num);
        int[] rightArr = Arrays.copyOfRange(arr, num, arr.length);
        System.out.println("split two array: " + Arrays.toString(leftArr) + " And " + Arrays.toString(rightArr));
        // 不断拆分为最小单元，再排序合并
        return mergeTwoArray(mergingSort(leftArr), mergingSort(rightArr));
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        // 申请额外的空间存储合并之后的数组
        int[] result = new int[arr1.length + arr2.length];
        // 选取两个序列中的较小值放入新数组
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        // 序列1中多余的元素移入新数组
        while(i < arr1.length){
            result[k++] = arr1[i++];
        }
        // 序列2中多余的元素移入新数组
        while(j < arr2.length){
            result[k++] = arr2[j++];
        }
        System.out.println("Merging: " + Arrays.toString(result));
        return result;
    }
}
