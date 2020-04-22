package mtituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/16 19:24
 */
public class meituan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,m;
        long x;
        a = sc.nextInt();
        b = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextLong();
        Map<Long, Integer> map = new HashMap<>();
        int index = 0;
        while(true){
            x = ((a*x)+b) % m;
            if (map.containsKey(x)){
                System.out.println(index - map.get(x));
                break;
            }
            else {
                map.put(x,index);
                index++;
            }
        }
    }
}
