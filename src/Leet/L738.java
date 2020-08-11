package Leet;

import java.util.Arrays;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/07/21 13:17
 */
public class L738 {
    public static int monotoneIncreasingDigits(int N) {
        if (N < 10) {
            return N;
        }
        char[] chs = String.valueOf(N).toCharArray();
        for (int i = 1; i < chs.length; i++) {
            if (chs[i] < chs[i - 1]) {
                Arrays.fill(chs, i, chs.length, '9');
                i--;
                chs[i]--;
                while (i > 0 && chs[i - 1] > chs[i]) {
                    chs[i] = '9';
                    chs[i - 1]--;
                    i--;
                }
                break;
            }
        }

        return Integer.parseInt(String.valueOf(chs));
    }

    public static void main(String[] args) {
        int n = 72323;
        System.out.println(monotoneIncreasingDigits(n));
    }
}
