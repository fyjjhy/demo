package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 堆排序<br>
 * 1.先将初始序列k[1...n]建成一个大顶堆，那么此时第一个元素k1最大，此堆为初始的无序区。
 * 2.再将关键字最大的记录k1(即堆顶，第一个元素)和无序区的最后一个记录kn交换，由此得到新的无序区k[1...n-1]和有序区k[n]，且满足k[1...n-1].keys=k[n].key
 * 3.交换k1和kn后，堆顶可能违反堆性质，因此需将k[1...n-1]调整为堆。然后重复步骤2，直到无序区中只有一个元素时停止。
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月20日 <br>
 * @see dataStructure.sort <br>
 * @since V1.0 <br>
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Max_Heapify: " + Arrays.toString(arr));
        heapSort(arr);
    }

    private static void heapSort(int[] arr) {
        for(int i = arr.length; i > 0; i--){
            max_heapify(arr, i);
            // 堆顶元素(第一个元素)与Kn交换
            int temp = arr[0];
            arr[0] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    private static void max_heapify(int[] arr, int limit){
        if(arr.length <= 0 || arr.length < limit) {
            return;
        }
        // 7
        int parentIdx = limit / 2;
        for(; parentIdx >= 0; parentIdx--){
            if(parentIdx * 2 >= limit){
                continue;
            }
            // 左子节点位置
            int left = parentIdx * 2;// 14
            // 右子节点位置，如果没有右节点，默认为左节点位置
            int right = (left + 1) >= limit ? left : (left + 1);// 15
            int maxChildId = arr[left] >= arr[right] ? left : right;// 14
            // 交换父节点与左右子节点中的最大值
            if(arr[maxChildId] > arr[parentIdx]){
                int temp = arr[parentIdx];
                arr[parentIdx] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }
        System.out.println("Max_Heapify: " + Arrays.toString(arr));
    }
}
