package test;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/20 12:35
 */
public class ListTest {
    public static class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(9);

        list.add(3,5);
        //lambda表达式 Collection.sort的表达式
        list.sort((o1, o2) -> o2 - o1);

        System.out.println(list.toString());


    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            res += Math.max(Math.abs(points[i][0] - points[i+1][0]), Math.abs(points[i][1] - points[i+1][1]));
        }
        return res;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return ArrayToBST(nums, 0, nums.length - 1);
    }

    TreeNode ArrayToBST(int[] nums, int i, int j){
        if(i == j){
            return new TreeNode(nums[i]);
        }
        int mid = i + ((j - i) / 2);
        TreeNode t = new TreeNode(nums[mid]);
        t.left = ArrayToBST(nums, i, mid - 1);
        t.right = ArrayToBST(nums, mid + 1, j);
        return t;

    }
}
