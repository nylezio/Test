package threadtest;

/**
 * @author: codeJerry
 * @description: 单例模式线程安全的懒汉式
 * @date: 2020/04/18 21:34
 */

public class SingleTon {
    private static volatile SingleTon instance = null;


    private SingleTon() {
    }

    public static SingleTon getInstance(){
        if (instance == null){
            synchronized (SingleTon.class){
                if (instance == null){
                     instance = new SingleTon();
                    System.out.println("getInstance()");
                }
                return instance;
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        SingleTon single = SingleTon.getInstance();
        SingleTon single2 = SingleTon.getInstance();
        System.out.println(single.equals(single2));
    }
}
