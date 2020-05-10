package test;

/**
 * @author: CHNjerry
 * @description: 自己随便写的测试
 * @date: 2020/03/27 18:53
 */
public class IntegerAndIntTest {
    public static void main(String[] args) {
        Integer b = 3;
        Integer c = 4;
        Integer d = 200;

        System.out.println();
        change(b);
        System.out.println(b);
        change(c);
        System.out.println(c);
        change(d);
        System.out.println(d);
        //输出都不变

    }

    private static void change(Integer b) {
        b += 1;
    }

}
