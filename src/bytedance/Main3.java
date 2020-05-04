package bytedance;

import java.util.Scanner;

/**
 * @description: 移动步数
 * 一条无限长的直线上，有无限多个点，相邻每个点的距离为1，现在有n堆学生，
 * 第i堆学生有a[i]个人都站在b[i]这个点上，现在要求每个点只能站一个学生，
 * 所以需要学生左右移动，一步一个点。为了节约时间，希望每个人的移动步数的最大值最小，
 * 请你求出这个最小值。
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();


        int x,y;
        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
        }



        for (int i = 0; i < N; i++) {
                System.out.print(1);
        }


    }
}
