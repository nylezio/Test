package bytedance;

import java.util.*;

/**
 * @description: 安全区概率
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,R,r;
        N = sc.nextInt();
        R = sc.nextInt();
        r = sc.nextInt();

        List<Integer> ans = new ArrayList<>();
        PriorityQueue<long[]> p = new PriorityQueue<long[] >(new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                if (o1[1] == o2[1]){
                    return 0;
                }
                if (o1[1] < o2[1]){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });

        int x,y;
        for (int i = 1; i <= N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            long dis =  (long) Math.pow(((long) x * (long)x + (long)y * (long)y), 0.5);
            if (dis < R - r){
                ans.add(i);
            } else {
                p.add(new long[]{i, dis});
            }
        }

        while (!p.isEmpty()){
             ans.add((int) p.poll()[0]);
        }



        for (int i = 0; i < N; i++) {
            System.out.print(ans.get(i));
            if (i < N - 1){
                System.out.print(" ");
            }
        }


    }
}
