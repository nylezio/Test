package test;

import java.util.Arrays;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/06/23 21:26
 */
public class Solution {
    public  int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length - 1, k - 1);

    }

    public int[] quickSearch(int[] arr, int l, int r, int k){
        int j = partition(arr, l, r);
        System.out.println(j);
        System.out.println(Arrays.toString(arr));
        if (j == k){
            return Arrays.copyOf(arr, j + 1);
        }

        return j > k ? quickSearch(arr, l, j - 1, k) : quickSearch(arr, j + 1, r, k);
    }

    public int partition(int[] arr, int l, int r){
        int temp = arr[l];
        int i = l + 1, j = r;
        while (true) {
            while (i < r && arr[i] <= temp){
                i++;
            }
            while (j > l && arr[j] >= temp){
                j--;
            }

            if (i >= j) {
                break;
            }
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,1,3,0,5,0,7,6,7};
        int k = 9;
        Solution solution = new Solution();
        int[] leastNumbers = solution.getLeastNumbers(arr, k);
        System.out.println(Arrays.toString(leastNumbers));
    }
}
