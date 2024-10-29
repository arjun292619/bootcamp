package com.javaBootCamp.algos.linkedLists;

import com.javaBootCamp.algos.linkedLists.sll.Node;

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
        Node list1 = test.insertAtBegin(null, 5);
        list1 = test.insertAtBegin(list1, 15);
        list1 = test.insertAtBegin(list1, 25);
        list1 = test.insertAtBegin(list1, 35);
        list1 = test.insertAtBegin(list1, 45);
//        System.out.println();
        test.printListRecursive(list1);

        Node list2 = test.insertAtEnd(null, 6);
        list2 = test.insertAtEnd(list2, 16);
        list2 = test.insertAtEnd(list2, 26);
        list2 = test.insertAtEnd(list2, 36);
        list2 = test.insertAtEnd(list2, 46);
        test.printListIterative(list2);
        System.out.println(test.search(list2, 46));

        Node list3 = test.insertAtEnd(null, 3);
        list3 = test.insertAtEnd(list3, 13);
        test.printListIterative(list3);
        list3 = test.deleteAtBegin(list3);
        test.printListIterative(list3);
    }

    public void printListIterative(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }
        System.out.println();
    }

    public void printListRecursive(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        printListRecursive(head.next);
    }

    public Node insertAtBegin(Node node, int x) {
        Node newhead = new Node(x);
        newhead.next = node;
        return newhead;
    }

    public Node insertAtEnd(Node node, int x) {
        Node newNode = new Node(x);
        if (node == null) return newNode;
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return node;
    }

    public Node deleteAtBegin(Node head) {
        if (head == null) return null;
        Node nextNode = head.next;
        head = null;
        return nextNode;
    }

    public int search(Node list, int key) {
        Node current = list;
        int i = -1;
        while (current != null) {
            i++;
            if (current.data == key) return i;
            current = current.next;
        }
        return -1;
    }
}
