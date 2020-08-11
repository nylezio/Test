package Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/07/06 14:31
 */
public class L967 {

    List<Integer> ans;
    int N;
    int k;
    public int[] numsSameConsecDiff(int N, int k) {
        ans = new ArrayList<>();
        this.N = N;
        this.k = k;
        if (N == 1) {
            ans.add(0);
        }
        for (int i = 1; i <= 9; i++) {
            dfs(0, i);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
    public void dfs(int index, int num) {
        if (index + 1 == N) {
            ans.add(num);
            return;
        }
        int t1 = num % 10 + k;
        int t2 = num % 10 - k;
        if (t1 < 10) {
            int sum = num * 10 + t1;
            dfs(index + 1, sum);
        }
        if (t2 >= 0) {
            int sum = num * 10 + t2;
            dfs(index + 1, sum);
        }
    }

    public static void main(String[] args) {
        L967 l967 = new L967();
        System.out.println(Arrays.toString(l967.numsSameConsecDiff(2, 1)));
    }
}