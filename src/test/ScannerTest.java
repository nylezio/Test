package test;

import java.util.Scanner;

/**
 * @author: codeJerry
 * @description: 输入测试
 * @date: 2020/03/31 17:13
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(n+""+k);
    }
}
