package huawei;

import java.util.*;

/**
 *
 */
class Tree{
    public int val;
    public int max = Integer.MIN_VALUE;
    public Tree left;
    public Tree right;

    public Tree(int val) {
        this.val = val;
    }
}
public class Main3 {
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String next = in.nextLine();
        Tree tree = buildTree(next);

        dp(tree);
        dfs(tree);
        System.out.println(max);
    }

    private static void dfs(Tree tree) {
        if (tree == null){
            return;
        }
        max = Math.max(max, tree.max);
        dfs(tree.left);
        dfs(tree.right);
    }

    private static int dp(Tree tree){
        if (tree == null){
            return 0;
        }
        if (tree.max != Integer.MIN_VALUE){
            return tree.max;
        }
        int res = tree.val;
        res = Math.max(res, tree.val + dp(tree.left));
        res = Math.max(res, tree.val + dp(tree.right));
        tree.max = Math.max(0, res);
        return res;
    }

    public static Tree buildTree(String str){
        if (str == null || str.length() == 0){
            return null;
        }
        int index = str.indexOf("(");
        int val = -1;
        if (index == -1){
            val = Integer.parseInt(str);
            if (val == 0){
                return null;
            } else {
                return new Tree(val);
            }

        }
        val = Integer.parseInt(str.substring(0,index));
        if (val == 0){
            return null;
        }
        Tree root = new Tree(val);
        int index2 = str.indexOf(",");
        root.left = buildTree(str.substring(index + 1, index2));
        root.right = buildTree(str.substring(index2 + 1, str.length() - 1));
        return root;
    }
}
