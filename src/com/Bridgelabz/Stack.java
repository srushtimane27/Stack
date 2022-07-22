package com.Bridgelabz;

public class Stack {
    int stack[] = new int[3];
    int top = 0;

    /*
     *  push elements inside
    */
    public void push(int data){
        stack[top] = data;
        top++;                                          //increse top value
    }

    /*
     * pop the elements out
     */
    public int pop()
    {
        int data;
        top--;
        data = stack[top];
        stack[top]=0;
        return data;
    }

    /*
     * fetch the first element of the stack or
     * show present element at the top of the stack
     */
    public int peek()
    {
        int data;
        data = stack[top-1];
        return data;
    }

    /*
     * show element
     */
    public void show(){
        for (int n : stack){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
