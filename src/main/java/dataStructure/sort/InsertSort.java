package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 直接插入排序<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月09日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = { 12, 32, 22, 7, 48, 7, 3, 22, 0 };
        // 第一层循环：遍历待比较的所有数组元素
        for (int i = 0, len = array.length; i < len; i++) {
            // 第二层循环：将本轮选择的元素(selected)与已经排好序的元素(ordered)相比较
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("最后的排序：" + Arrays.toString(array));
    }
}
