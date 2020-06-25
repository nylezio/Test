package test;


/**
 * @author: codeJerry
 * @description: 单例双端检测模式
 * @date: 2020/05/12 13:08
 */
public class SingleTonTest {
    private volatile static SingleTonTest singleTonTest = null;

    private SingleTonTest(){}

    public static SingleTonTest getInstance(){
        if (singleTonTest == null) {
            synchronized (SingleTonTest.class){
                if (singleTonTest == null){
                    singleTonTest = new SingleTonTest();
                    System.out.println("创建了");
                }
            }
        }
        return singleTonTest;
    }

    public static void main(String[] args) {
        SingleTonTest test = SingleTonTest.getInstance();
        SingleTonTest test1 = SingleTonTest.getInstance();
        SingleTonTest test2 = SingleTonTest.getInstance();
    }
}
