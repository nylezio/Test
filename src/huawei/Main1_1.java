package huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */

public class Main1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        while (in.hasNextInt()) {
            int a = in.nextInt();
            set.add(a);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            for (int i = 0; i < 3; i++) {
                System.out.print(num);
                System.out.print(" ");
            }
        }




    }
}
