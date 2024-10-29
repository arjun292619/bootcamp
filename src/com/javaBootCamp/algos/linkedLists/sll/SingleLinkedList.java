package com.javaBootCamp.algos.linkedLists.sll;

public class SingleLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public SingleLinkedList(Node head) {
        this.head = head;
        this.tail = null;
        ++size;
    }

    public SingleLinkedList(int data) {
        head = new Node(data);
        tail = null;
        ++size;
    }

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
    }
}
