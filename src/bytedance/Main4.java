package bytedance;

import java.util.*;

/**
 * @author: codeJerry
 * @description: 最大完美度
 * @date: 2020/05/03 18:59
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,K;
        N = sc.nextInt();
        K = sc.nextInt();

        long[] arr = new long[N];
        List<Long> five = new ArrayList<>();
        List<Long> two = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] % 5 == 0){
                five.add(arr[i]);
                continue;
            }
            if (arr[i] % 2 == 0){
                five.add(arr[i]);
                continue;
            }

        }
        Collections.sort(five, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return countFive(o2) - countFive(o1);
            }

            private int countFive(Long o2) {
                int count = 0;
                while (o2 % 5 == 0){
                    count++;
                    o2 /= 5;
                }
                return count;
            }
        });
        Collections.sort(two, (o1,o2) -> (int) (o2.longValue() - o1.longValue()));
        Long tempres = 1L;
        int count = 0, index = 0;
        while (index < five.size() && count < K - 1){
            tempres *= five.get(index++);
            count++;
        }

        index = 0;
        while (index < two.size() && count < K){
            tempres *= two.get(index++);
            count++;
        }
        if (count < K && count < five.size()){
            tempres *= five.get(count++);
        }

        System.out.println(countZero(tempres));




    }

    private static int countZero(Long a) {
        Long w = 10L;
        int res = 0;
        while (a % w == 0){
            res++;
            w *= 10;
        }
        return res;
    }
}
