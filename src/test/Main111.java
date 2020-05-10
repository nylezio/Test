package test;


import java.util.*;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/05/08 20:13
 */
public class Main111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] a = new int[N][2];
        int[][] b = new int[N][2];

        for(int i = 0; i < N; i++){
            a[i][0] = in.nextInt();
            a[i][1] = i;

        }
        for(int i = 0; i < N; i++){
            b[i][0] = in.nextInt();
            b[i][1] = i;
        }

        Arrays.sort(a, (o1, o2) -> o1[0] - o2[0]);
        Arrays.sort(b, (o1, o2) -> o1[0] - o2[0]);

        int i = 0;

        if (a[0][1] != b[0][1]){
            System.out.println(a[0][0] + b[0][0]);
        } else {
            System.out.println(Math.min(a[1][0] + b[0][0], a[0][0] + b[1][0]));
        }



    }
}
