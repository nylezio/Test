package test;

import java.util.*;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/05/13 12:09
 */
class  TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.poll();
        System.out.println(queue);
        Deque<Integer > deque = new LinkedList<>();
        deque.add(3);
        deque.addFirst(1);
        deque.add(4);
        deque.addLast(2);
        System.out.println(deque);
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
    }
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {return ans;}

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);

        int level = 0;
        while (!deque.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            int len = deque.size();
            level++;
            for (int i = 0; i < len; i++){
                TreeNode node = deque.pop();
                tmp.add(node.val);

                if (level % 2 == 0){
                    if (node.left != null){
                        deque.addFirst(node.left);
                    }
                    if (node.right != null){
                        deque.addFirst(node.right);
                    }
                } else {
                    if (node.right != null) {
                        deque.addLast(node.right);
                    }
                    if (node.left != null) {
                        deque.addLast(node.left);
                    }
                }
            }
            ans.add(tmp);
        }
        return ans;
    }
}