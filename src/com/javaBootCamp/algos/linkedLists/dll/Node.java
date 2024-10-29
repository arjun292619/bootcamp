package com.javaBootCamp.algos.linkedLists.dll;

public class Node {
    int data;
    Node next;
    Node previous;
    int size;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
        size = 0;
    }
}
