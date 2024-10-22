package com.javaBootCamp.algos.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queArr = new ArrayDeque<>();
        queArr.offer(10);
        queArr.add(20);
        queArr.offer(30);
        System.out.println(queArr.size());
        System.out.println(queArr.toString());
        System.out.println(queArr.peek());
        System.out.println(queArr.toString());
        System.out.println(queArr.poll());
        System.out.println(queArr.toString());
    }
}
