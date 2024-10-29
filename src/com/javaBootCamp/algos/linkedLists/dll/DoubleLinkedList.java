package com.javaBootCamp.algos.linkedLists.dll;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DoubleLinkedList(int data) {
        Node node = new Node(data);
        this.head = node;
        this.tail = node;
        this.size++;
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
}
