package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月20日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class ShellSortCase {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("sorting: " + Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int gap = 1, i, j, len = arr.length;
        int temp;
        while (gap < len / 3) {
            // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {
            System.out.println(gap);
            for (i = gap; i < len; i++) {
                temp = arr[i];
                for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap) {
                    arr[j + gap] = arr[j];
                    System.out.println("sorting: " + Arrays.toString(arr));
                }
                arr[j + gap] = temp;
            }
        }
    }
}
