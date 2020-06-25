package test;


/**
 * @author: codeJerry
 * @description: 单例 静态内部类
 * @date: 2020/05/12 13:08
 */
public class Single {

    private Single(){}

    private static class SingleTonStaticLazy{
        public static Single single = new Single();
    }

    public static Single getInstance(){
        return SingleTonStaticLazy.single;
    }

    public static void main(String[] args) {
        Single test = Single.getInstance();
        Single test1 = Single.getInstance();
        Single test2 = Single.getInstance();
    }
}
