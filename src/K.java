import java.util.HashSet;
import java.util.Set;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/07/05 11:22
 */
public class K {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans = 0;Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int le : left) {
            set1.add(le);
        }
        for (int ri : right) {
            set2.add(ri);
        }
        while (!set1.isEmpty() || !set2.isEmpty()) {

        }
        return ans;
    }
}
