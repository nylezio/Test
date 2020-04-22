package threadtest;

import java.util.concurrent.TimeUnit;

/**
 * @author: codeJerry
 * @description: 生产者消费者
 * @date: 2020/04/18 21:19
 */

class Clerk{
    private int product = 0;
    public synchronized void produceProduct(){
        if (product < 1){
            product++;
            System.out.println(Thread.currentThread().getName()+"生产商品"+ product);
            notify();
        }
        else {
            try {
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public synchronized void consumeProduct(){
        if (product > 0){
            product--;
            System.out.println(Thread.currentThread().getName() + "消费商品" + product);
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始生产");
        while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            clerk.produceProduct();
        }

    }
}
class Consumer implements Runnable{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始消费");
        while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            clerk.consumeProduct();
        }

    }
}
public class ConsumerAndCustomer {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.setName("生产者");
        t2.setName("消费者");
        t1.start();
        t2.start();
    }




}
