package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 希尔排序<br>
 * 1.选择一个增量序列t1，t2，。。。，tk，其中ti>tj，tk=1；(一般初次取数组半长，之后每次再减半，直到增量为1)
 * 2.按增量序列个数k，对序列进行k趟排序；
 * 3.每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m的子序列，分别对各子序列进行直接插入排序。仅增量
 * 因子为1时，真个序列作为一个序列来处理，序列长度即为整个序列的长度。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月20日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        shellSort(arr);
    }

    private static void shellSort(int[] arr) {
        int len = arr.length;
        int gap = len / 2;
        // 不断缩小gap，直到1为止
        for (; gap > 0; gap /= 2) {
            System.out.println(gap);
            // 使用当前gap进行组内插入排序
            for (int j = 0; (j+gap) < len; j++){
                for(int k = 0; (k+gap)< len; k += gap){
                    if(arr[k] > arr[k+gap]) {
                        // 交换操作
                        int temp = arr[k+gap];
                        arr[k+gap] = arr[k];
                        arr[k] = temp;
                        System.out.println("Sorting: " + Arrays.toString(arr));
                    }
                }
            }
        }
    }
}
