package test;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author Foxs
 */
public class EggsAndFloor {

    public static void main(String[] args) {
        System.out.println("Enter the number of eggs and layers:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("You should try " + getResult(k, n) + " times in the worse case.");
    }
    //establish a memory to record the executed data.
    public static int [][] memory = new int[1000][1000];
    public static int getResult(int k, int n) {
        if (n == 0) {
            // if the layer is zero, 0 absolutely!
            return 0;
        }
        if (k == 1) {
            // if the egg is only one, you should throw from 1 to n!
            return n;
        }
        if(memory[k-1][n-1]!=0) {
            return memory[k-1][n-1];
        }
        int res = (int)Float.POSITIVE_INFINITY;
        for (int i = 1; i <= n; i++) {
            //dynamic programming.
            res = Math.min(Math.max(getResult(k - 1, i - 1), getResult(k,n-i))+1,res);
        }
        //record
        memory[k-1][n-1]=res;
        return res;
    }
}
