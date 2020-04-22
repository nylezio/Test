package threadtest;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/20 11:50
 */
public class ManyThread {
    public static void main(String[] args) {
        while(true){

            new Thread(() ->{
                System.out.println(Thread.currentThread().getName()+"你好");
                    },"t").start();
        }


    }
}
