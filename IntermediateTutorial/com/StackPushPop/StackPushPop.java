package com.StackPushPop;

import java.util.*;

public class StackPushPop {

    public static void main(String[] args) {

        //in stack the last thing you entered has highest priority

        Stack<String> stack = new Stack<String>();
        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);

    }

    private static void printStack(Stack<String> s){
        if(s.isEmpty())
            System.out.println("you have nothing in your stack");
        else
            System.out.printf("%s TOP\n", s);
    }

}
