package mtituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/16 19:35
 */
public class meituan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int K;
        N = sc.nextInt();
        K = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);


        int x = nums[(int) ((K - 1) / N)];
        int x_num = 0;
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (nums[i] == x){
                if (index == -1){
                    index = i;
                }
                x_num++;
            }
        }

        int y = nums[((K - 1) - x * (N-index))* x_num];


        System.out.println("(" + x + "," + y + ")");
    }
}
