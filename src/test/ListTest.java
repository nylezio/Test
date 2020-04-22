package test;

import java.util.*;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/20 12:35
 */
public class ListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(9);

        //lambda表达式 Collection.sort的表达式
        list.sort((o1, o2) -> o2 - o1);

        System.out.println(list.toString());
    }
}
