package test;

/**
 * @author: codeJerry
 * @description:
 * ss
 * @date: 2020/03/29 19:58
 */
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Test {

     public void changeName(){

     }
    public static void main(String[] args) {
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        System.out.println("-Xmx:Max"+max/1024/1024+"mb");
        System.out.println("-Xms:Total"+total/1024/1024+"mb");
        Person person = new Person("aa");
    }
}

