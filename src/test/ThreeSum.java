package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/06/24 15:34
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 3) {return ans;}
        quickSort(nums, 0, len - 1);
        System.out.println(Arrays.toString(nums));
        if (nums[len - 1] < 0) {
            return ans;
        }

        for (int i = 0; i < len - 2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int min = nums[i] + nums[i + 1] + nums[i + 2];
            if (min > 0) {
                break;
            }
            int k = len - 1;
            int target = -nums[i];
            for (int j = i + 1; j < len; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (j < k && nums[j] + nums[k] > target) {
                    k--;
                }
                if (j == k) {
                    break;
                }
                if (nums[j] + nums[k] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = nums[l];
        int i = l + 1;
        int j = r;
        while (true) {
            while (i < r && nums[i] <= temp) {
                i++;
            }
            while (j > l && nums[j] >= temp) {
                j--;
            }
            if (i >= j) {
                break;
            }
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        nums[l] = nums[j];
        nums[j] = temp;
        quickSort(nums, l, j - 1);
        quickSort(nums, j + 1, r);
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum.threeSum(nums);
    }
}
