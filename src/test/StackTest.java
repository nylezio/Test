package test;

import java.util.Stack;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/24 11:47
 */
public class StackTest {

    public int balancedStringSplit(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        count = stack.pop();
        return count;
    }
}
