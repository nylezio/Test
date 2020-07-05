import java.util.*;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/07/02 20:42
 */

public class TrackBrack {

        public List<String> ans = new ArrayList<>();
        public boolean[] used;
        public String[] permutation(String s) {
            if (s == null || s.length() == 0) {
                return new String[]{""};
            }

            char[] chs = s.toCharArray();
            used = new boolean[chs.length];
            StringBuilder path = new StringBuilder(chs.length);
            Arrays.sort(chs);
            permutate(chs, path, 0);
            return ans.toArray(new String[0]);
        }

        public void permutate(char[] chs, StringBuilder path, int index) {
            if (index == chs.length) {
                ans.add(path.toString());
                return;
            }

            for (int i = 0; i < chs.length; i++) {
                if (!used[i]) {

                    // 根据已排序字符数组, 剪枝
                    if (i > 0 && chs[i] == chs[i - 1] && !used[i - 1]) {
                        continue;
                    }
                    path.append(chs[i]);
                    // 标记选择
                    used[i] = true;
                    permutate(chs, path, index + 1);
                    path.deleteCharAt(index);
                    // 撤销选择
                    used[i] = false;
                }
            }
        }

    public static void main(String[] args) {
        String s = "qqe";
        TrackBrack trackBrack = new TrackBrack();
        System.out.println(Arrays.toString(trackBrack.permutation(s)));
    }
}