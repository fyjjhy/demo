package dataStructure.sort;

import java.util.Arrays;

/**
 * <Description> 基数排序<br>
 * 算法描述：
 * 1.取得数组中的最大数，并取得位数
 * 2.arr为原始数组，从最低位开始取每个位组成radix数组
 * 3.对radix进行计数排序(利用计数排序适用于小范围数的特点)
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月13日 <br>
 * @see dataStructure.algorithm <br>
 * @since V1.0 <br>
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 1.取得数组中的最大数，并取得位数
        int max = arr[0];
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int digit = (max + "").length();
        System.out.println(digit);
        System.out.println(max);
        // 2.arr为原始数组，从最低位开始取每个位组成radix数组
        // 申请一个桶，将带排序元素放入桶中
        int[][] bucket = new int[10][len];
        // 设定基数
        int base = 10;
        for (int i = 0; i < digit; i++) {
            int[] bktLen = new int[10];
            for (int j = 0; j < len; j++) {
                int everyone = (arr[j] % base) / (base / 10);
                bucket[everyone][bktLen[everyone]] = arr[j];
                bktLen[everyone]++;
            }

            // 收集
            int l = 0;
            for (int j = 0; j < bucket.length; j++) {
                System.out.println("bktLen:" + Arrays.toString(bktLen));
                for (int k = 0; k < bktLen[j]; k++) {
                    arr[l++] = bucket[j][k];
                }
                System.out.println("从最低位开始: 第" + (i+1) + "位, bucket: j = " + j + ":" + Arrays.toString(bucket[j]));
            }
            base *= 10;
        }
    }
}
