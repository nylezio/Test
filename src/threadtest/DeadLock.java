package threadtest;

import java.util.concurrent.TimeUnit;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/18 22:08
 */
public class DeadLock {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1){
                    try {
                        TimeUnit.SECONDS.sleep(3);
                        s1.append("a");
                        System.out.println("s1="+s1);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    synchronized (s2){
                        s2.append("b");
                        System.out.println("s2="+s2);
                    }
                }
            }
        },"线程1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    try {
                        TimeUnit.SECONDS.sleep(3);
                        s2.append("1");
                        System.out.println("s2="+s2);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    synchronized (s1){
                        s1.append("2");
                        System.out.println("s1="+s1);
                    }
                }
            }
        },"线程2").start();
    }
}
