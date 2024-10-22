package com.javaBootCamp.algos.stacks;

import java.util.ArrayDeque;

public class StackDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.offer(40);
        System.out.println(stack1.toString());
        System.out.println(stack1.peek());
        stack1.pop();
        System.out.println(stack1.toString());
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());

    }
}
