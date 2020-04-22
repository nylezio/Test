package zhousai;

/**
 * @author: codeJerry
 * @description: 重新格式化字符串
 * 给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。
 *
 * 请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。
 *
 * 请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。
 * @date: 2020/04/19 10:42
 */
public class Reformat {
    public static String reformat(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        int letterNum = 0;
        int digitNum = 0;
        StringBuilder s1 = new StringBuilder(letterNum);
        StringBuilder s2 = new StringBuilder(digitNum);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                letterNum++;
                s1.append(c);
            } else {
                digitNum++;
                s2.append(c);
            }
        }
        if (Math.abs(letterNum - digitNum) > 1){
            return stringBuilder.toString();
        }

        if (letterNum > digitNum){
            for (int i = 0; i < digitNum; i++) {
                stringBuilder.append(s1.charAt(i));
                stringBuilder.append(s2.charAt(i));
            }
            stringBuilder.append(s1.charAt(letterNum - 1));
        } else {
            for (int i = 0; i < letterNum; i++) {
                stringBuilder.append(s2.charAt(i));
                stringBuilder.append(s1.charAt(i));
            }
            if (digitNum > letterNum){
                stringBuilder.append(s2.charAt(digitNum - 1));
            }
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String string = ("ab123");
        System.out.println(reformat(string));
    }
}
