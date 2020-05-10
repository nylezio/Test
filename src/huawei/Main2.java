package huawei;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 */

public class Main2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M, N;
        M = in.nextInt();
        N = in.nextInt();

        int[] memory = new int[M];
        int[][] request = new int[N][2];
        for (int i = 0; i < M; i++) {
            memory[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            request[i][0] = in.nextInt();
            request[i][1] = in.nextInt();
        }

        Arrays.sort(memory);
        Arrays.sort(request, ((o1, o2) -> o1[0] - o2[0]));

        long sum = 0;
        int j = 0;
        PriorityQueue<int[] > heap = new PriorityQueue<>(((o1, o2) -> o2[1] - o1[1]));
        for (int i = 0; i < M; i++) {
            while (j < N && request[j][0] <= memory[i]){
                heap.add(request[j]);
                j++;
            }
            if (!heap.isEmpty()){
                sum += heap.poll()[1];
            }
        }
        System.out.println(sum);

    }
}
