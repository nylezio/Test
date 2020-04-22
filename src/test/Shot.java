package test;

import java.util.Scanner;

/**
 * @author: codeJerry
 * @description: 美团射击分数题
 * @date: 2020/04/02 19:06
 * 3
 * 0.9 0.1 0.1
 * 2    1    1
 * 输出 4.88
 *
 */
public class Shot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        double[] p = new double[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextDouble();
        }
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextDouble();
        }
        double res = 0;
        res = countValue(N, p, a);
        System.out.println(res);
    }

    public static double countValue(int N, double[] p, double[] a){
        if(N==0){return 0;}
        double res = 0;
        double[] dp = new double[N+1];
        dp[0] = 0;
        dp[1] = p[0] * a[0];
        double p_choice = p[0];
        for (int i = 2; i < N + 1; i++) {
            double left = dp[i-1] + p_choice * p[0] * a[0];
            double right = p[i-1]*a[i-1];
            dp[i] = Math.max(left, right);
            if (left > right){
                p_choice = p_choice * p[0];
            } else if(left == right){
                p_choice = p_choice * p[0] > p[i - 1] ? p_choice * p[0]: p[i-1];
            } else {
                p_choice = p[i-1];
            }
        }

        res = (double) Math.round(dp[N]*100)/100;
        return res;
    }
}
