package dataStructure.sort;

import java.util.Arrays;
import java.util.Stack;

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
public class QuickSortCase {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quickSortByStack(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortByStack(int[] arr) {
        if(arr.length <= 0) return;
        Stack<Integer> stack = new Stack<Integer>();

        // 初始状态的左右指针入栈
        stack.push(0);
        stack.push(arr.length - 1);
        while(!stack.isEmpty()){
            // 出栈进行划分
            int high = stack.pop();
            int low = stack.pop();

            int pivotIdx = partition(arr, low, high);

            // 保存中间变量
            if(pivotIdx > low) {
                stack.push(low);
                stack.push(pivotIdx - 1);
            }
            if(pivotIdx < high && pivotIdx >= 0){
                stack.push(pivotIdx + 1);
                stack.push(high);
            }
        }
    }

    private static int partition(int[] arr, int low, int high){
        if(arr.length <= 0) return -1;
        if(low >= high) return -1;
        int l = low;
        int r = high;

        // 挖坑1：保存基准的值
        int pivot = arr[l];
        while(l < r){
            // 坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
            while(l < r && arr[r] >= pivot){
                r--;
            }
            arr[l] = arr[r];
            // 坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
            while(l < r && arr[l] <= pivot){
                l++;
            }
            arr[r] = arr[l];
        }
        // 基准值填补到坑3中，准备分治递归快排
        arr[l] = pivot;
        return l;
    }
}
