package test;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/08 19:12
 */
public class Score {

    static public void chan(int score){
        if (score > 55){
            score += 5;
            System.out.println("及格了，分数是:"+ score);
        } else {
            score += 5;
            System.out.println("没及格"+score);
        }
    }

    public static void main(String[] args) {
        int score = 56;
        chan(score);
        System.out.println("真实分数是:"+score);
    }
}
