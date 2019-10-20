package dataStructure.algorithm;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月18日 <br>
 * @see dataStructure.algorithm <br>
 * @since V1.0 <br>
 */
public class RadixSortCase {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("开始-Sorting: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("结束-Sorting: " + Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        if(arr.length <= 1) return;
        // 1.取得数组中的最大数，并取得位数
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int maxDigit = 1;
        while(max / 10 > 0){
            maxDigit++;
            max = max / 10;
        }
        System.out.println("maxDigit: " + maxDigit);
        // 申请一个桶空间
        int[][] buckets = new int[10][arr.length];
        int base = 10;
        // 从低位到高位，对每一位遍历，将所有元素分配到桶中
        for(int i = 0; i < maxDigit; i++){
            // 存储各个桶中存储元素的数量
            int[] bktLen = new int[10];
            // 分配：将所有元素分配到桶中
            for(int j = 0, len = arr.length; j < len; j++){
                int whichBucket = (arr[j] % base) / (base / 10);
                buckets[whichBucket][bktLen[whichBucket]] = arr[j];
                bktLen[whichBucket]++;
            }

            // 收集：将不同桶里数据挨个捞出来,为下一轮高位排序做准备,由于靠近桶底的元素排名靠前,因此从桶底先捞
            int k = 0;
            for(int b = 0; b < buckets.length; b++){
                for(int p = 0; p < bktLen[b]; p++){
                    arr[k++] = buckets[b][p];
                }
            }

            System.out.println("Sorting: " + Arrays.toString(arr));
            base *= 10;
        }
    }
}
