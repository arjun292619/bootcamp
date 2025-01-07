package com.javaBootCamp.algos.linkedLists.sll;

public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

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

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
}
