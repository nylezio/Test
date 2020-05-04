package test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/23 20:56
 */
public class SetTest {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < J.length(); i++){
            set.add(J.charAt(i));
        }
        for(int i = 0; i < S.length(); i ++){
            if (set.contains(S.charAt(i))){
                res++;
            }
        }
        return res;
    }
}
