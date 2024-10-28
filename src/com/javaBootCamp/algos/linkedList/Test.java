package com.javaBootCamp.algos.linkedList;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        test.printListIterative(head);
        System.out.println();
        test.printListRecursive(head);
    }

    public void printListIterative(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }
    }

    public void printListRecursive(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printListRecursive(head.next);
    }
}
