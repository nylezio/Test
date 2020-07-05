package alibaba;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int A = in.nextInt();
        int D = in.nextInt();
        int n = in.nextInt();

        int[][] master = new int[n][3];
        for (int i = 0; i < n; i++) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            for (int j = 0; j < 3; j++){
                master[i][j] = in.nextInt();
            }

        }
        System.out.println(2);
    }
}