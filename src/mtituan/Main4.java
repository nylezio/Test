package mtituan;

import java.util.Scanner;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/16 20:07
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int K;
        N = sc.nextInt();
        K = sc.nextInt();
        int big_num = 0, small_num = 0, k_num = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num > K){
                big_num++;
            }
            else if (num < K){
                small_num++;
            } else {
                k_num++;
            }
        }

        int add = small_num > big_num ? small_num - big_num : big_num - small_num - 1;
        int div = k_num - 1;
        System.out.println(Math.max(0, add - div) );
    }
}
