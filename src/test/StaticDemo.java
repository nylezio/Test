package test;

/**
 * @author: codeJerry
 * @description:
 * 加载类后的运行顺序
 * 类中static 静态方法调用该类的new
 * 输出ACBACAC
 * @date: 2020/03/30 23:59
 */
public class StaticDemo {

    public static StaticDemo t1 = new StaticDemo();

    {
        System.out.println("blockA");
    }
    static {
        System.out.println("blockB");
    }

    StaticDemo(){
        System.out.println("BlockC");
    }


    public static void main(String[] args){
        System.out.println();
        StaticDemo t2 = new StaticDemo();
        System.out.println();
        StaticDemo t3 = new StaticDemo();
        System.out.println(t1.getClass());
    }
}
