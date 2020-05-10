package sevencow;

import java.util.Scanner;

/**
 * @author: codeJerry
 * @description:
 * 5 9 32 4 9 21 10
 * @date: 2020/05/07 19:42
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        if (nums[0] >= b){
            dp[0] = 1;
        } else {
            dp[0] = 0;
        }
//        System.out.println(dp[0]);
        for (int i = 1; i < N; i++) {
            dp[i] = dp[i - 1];
            int sum = 0;
            int com = 0;
            for (int j = i; j >= 0; j--){
                sum += nums[j];
                com += b;
                if (sum >= com){
                    dp[i]++;
                }
            }
//            System.out.println(dp[i]);
        }

        System.out.println(dp[N - 1]);
    }
}
