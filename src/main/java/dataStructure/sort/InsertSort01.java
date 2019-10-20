package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 直接插入排序<br>
 * 1.从第一个元素开始，该元素可以认为已经被排序
 * 2.取出下一个元素，在已经排序的元素序列中向前扫描
 * 3.如果该元素(已排序)大于新元素，将该元素移动到下一个位置
 * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 5.将新元素插入到该元素后
 * 6.重复步骤2~5
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月09日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class InsertSort01 {
    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(array);
    }

    private static void sort(int[] arr) {
        System.out.println("第0趟后的排序: " + Arrays.toString(arr));
        for (int i = 1, len = arr.length; i < len; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j+1] = arr[j];
                    if (j == 0) {
                        arr[j] = temp;
                    }
//                    System.out.println("Temping:  " + Arrays.toString(arr));
                } else {
                    arr[j+1] = temp;
//                    System.out.println("Sorting:  " + Arrays.toString(arr));
                    break;
                }
            }
            System.out.println("第" + i + "趟后的排序: " + Arrays.toString(arr));
        }

//        for (int i = 1, len = arr.length; i < len; i++) {
//            // 取出下一个元素，在已经排序的元素序列中从后向前扫描
//            int temp = arr[i];
//            for (int j = i; j >= 0; j--) {
//                if (j > 0 && arr[j - 1] > temp) {
//                    // 如果该元素（已排序）大于取出的元素temp，将该元素移到下一位置
//                    arr[j] = arr[j - 1];
//                    System.out.println("Temping:  " + Arrays.toString(arr));
//                } else {
//                    // 将新元素插入到该位置后
//                    arr[j] = temp;
//                    System.out.println("Sorting:  " + Arrays.toString(arr));
//                    break;
//                }
//            }
//        }
    }
}
