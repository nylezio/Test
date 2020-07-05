import java.util.Arrays;

/**
 * @author: codeJerry
 * @description:
 *      mat =  [[1,0,1],
 *             [1,1,0],
 *             [1,1,0]]
 * 输出：13
 * 解释：
 * 有 6 个 1x1 的矩形。
 * 有 2 个 1x2 的矩形。
 * 有 3 个 2x1 的矩形。
 * 有 1 个 2x2 的矩形。
 * 有 1 个 3x1 的矩形。
 * @date: 2020/07/05 10:34
 */
public class Solution {
    public int numSubmat(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        int m = mat[0].length;
        int[][] left = new int[n][m];
        int[][] up = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 1) {
                if (i > 0){
                    up[i][0] = up[i - 1][0] + 1;
                } else {
                    up[i][0] = 1;
                }
                left[i][0] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            if (mat[0][i] == 1) {
                if (i > 0){
                    left[0][i] = left[0][i - 1] + 1;
                } else {
                    left[0][i] = 1;
                }
                up[0][i] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 1) {
                    left[i][j] = left[i][j - 1] + 1;
                    up[i][j] = up[i - 1][j] + 1;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    int min = left[i][j];
                    for (int a = i; a >= i - up[i][j] + 1; a--) {
                        min = Math.min(left[a][j], min);
                        ans += min;
                    }
                    System.out.println(ans);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][] mat = {{0,1,1,0},
                {0,1,1,1},
                {1,1,1,0}};
        Solution solution = new Solution();
        System.out.println(solution.numSubmat(mat));
    }
}
