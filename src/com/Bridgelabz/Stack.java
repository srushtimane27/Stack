package com.Bridgelabz;

public class Stack {
    int stack[] = new int[3];
    int top = 0;                                        //push value at top
    public void push(int data){
        stack[top] = data;
        top++;                                          //increse top value
    }
    public void show(){
        for (int n : stack){
            System.out.print(n + " ");
        }
    }
}
