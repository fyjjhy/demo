package arithmetic;

import java.util.Arrays;

/**
 * <Description> 序列是否有序<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see arithmetic <br>
 * @since V1.0 <br>
 */
public class BubbleSorterDemo3 {

    private static void sort(int array[]) {
        int tmp = 0;
        for(int i = 0, len = array.length; i < len; i++) {
            boolean isSorted = true; // 有序标记，每一轮的初始是true
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1]; // 有元素交换，所以不是有序，标记变为false
                    array[j+1] = tmp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{5,8,6,3,9,2,1,7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
