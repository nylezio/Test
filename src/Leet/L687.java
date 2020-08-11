package Leet;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/07/09 17:58
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class L687 {
    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return ans;
        }
        dfs (root);
        return ans;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }


        int left = dfs(node.left);
        int right = dfs(node.right);

        left = node.left == null ? 0 : node.val == node.left.val ? left + 1 : 0;
        right = node.right == null ? 0 : node.val == node.right.val ? right + 1 : 0;

        ans = Math.max(ans, left + right);
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(4);
        node.left = node1;
        TreeNode node2 = new TreeNode(5);
        node.right = node2;
        node1.left = new TreeNode(4);
        node1.right = new TreeNode(4);
        node2.left = new TreeNode(5);
        L687 l687 = new L687();
        System.out.println(l687.longestUnivaluePath(node));
    }
}
