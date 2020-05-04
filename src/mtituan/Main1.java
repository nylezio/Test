package mtituan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/16 19:09
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M;
        N = sc.nextInt();
        M = sc.nextInt();
        int[][] score = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < M; i++) {
            int max = -1;
            for (int j = 0; j < N; j++){
                max = Math.max(max, score[j][i]);
            }
            for (int j = 0; j < N; j++) {
                if (score[j][i] == max){
                    set.add(j);
                }
            }
        }
        System.out.println(set.size());
    }
}
