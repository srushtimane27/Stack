package com.Bridgelabz;
//import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        System.out.println(stack.peek() + "peek");
        stack.push(56);
        stack.show();
        System.out.println("\n" + stack.pop() + "pop out: ");
        System.out.println("\n" + stack.pop() + "pop out: ");
        stack.pop();
        stack.show();

    }
}
