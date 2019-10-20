package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 冒泡算法<br>
 * 1.比较相邻的元素。如果第一个比第二个大，就交换两个元素
 * 2.对每一对相邻元素作同样的工作，从第一对到最后一对。这步完成后，最后的元素是最大的数
 * 3.针对所有的元素重复以上步骤，除了最后一个
 * 4.持续对越来越少的元素重复上面的步骤1-3，知道没有任何一对数字需要比较
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月11日 <br>
 * @see dataStructure.algorithm <br>
 * @since V1.0 <br>
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("第0趟：" + Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int len = arr.length;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (j + 1 < len && arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    if (!flag) {
                        flag = true;
                    }
                }
            }
            if (!flag) {
                break;
            }
            else {
                flag = false;
            }
            System.out.println("第" + (i + 1) + "趟：" + Arrays.toString(arr));
        }

//        for (int i = arr.length - 1; i > 0; i--) {      //外层循环移动游标
//            for(int j = 0; j < i; j++){    //内层循环遍历游标及之后(或之前)的元素
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    System.out.println("Sorting: " + Arrays.toString(arr));
//                    if (!flag) {
//                        flag = true;
//                    }
//                }
//            }
//            if (!flag) {
//                break;
//            }
//            else {
//                flag = false;
//            }
//            System.out.println("第" + (i + 1) + "趟：" + Arrays.toString(arr));
//        }
    }
}
