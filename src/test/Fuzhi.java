package test;

import java.util.Arrays;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/05/29 12:13
 */
public class Fuzhi {
    public static void main(String[] args) {
        int[] a=new int[5];
        int i=0;
        a[i++]=i&1;
        a[i++]=i&1;
        a[i++]=i&1;
        a[i++]=i&1;
        a[i++]=i&1;
        System.out.println(Arrays.toString(a));

    }
}
