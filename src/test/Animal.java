package test;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/05/06 22:33
 */
class Dog extends Animal {
    @Override
    public void bar() {
        System.out.println("狗叫");
    }

    public void ead() {
        System.out.println("吃狗粮");
    }
}

public class Animal {
    public void bar(){
        System.out.println("bar");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.bar();

        Dog dog = new Dog();
        dog.ead();

    }
}
