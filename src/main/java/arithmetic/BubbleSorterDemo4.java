package arithmetic;

import java.util.Arrays;

/**
 * <Description> 有序区边界<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see arithmetic <br>
 * @since V1.0 <br>
 */
public class BubbleSorterDemo4 {

    private static void sort(int array[]) {
        int tmp = 0;
        int lastExchangeIndex = 0; // 记录最后一次交换的位置
        int len = array.length;
        int sortBorder = len - 1;// 无序数列的边界，每次比较只需要比到这里为止
        for(int i = 0; i < len; i++) {
            boolean isSorted = true; // 有序标记，每一轮的初始是true
            for(int j = 0; j < sortBorder; j++) {
                if(array[j] > array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isSorted = false; // 有元素交换，所以不是有序，标记变为false
                    lastExchangeIndex = j; // 把无序数列的边界更新为最后一次交换元素的位置
                }
            }
            sortBorder = lastExchangeIndex;
            if(isSorted){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{3,4,2,1,5,6,7,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
