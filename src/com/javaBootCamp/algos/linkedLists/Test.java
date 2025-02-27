package com.javaBootCamp.algos.linkedLists;

import com.javaBootCamp.algos.linkedLists.sll.Node;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
        Node temp6 = new Node(70);
        Node temp7 = new Node(80);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        temp6.next = temp7;
        test.printListIterative(head);
        System.out.println("-".repeat(50));
//        Node reversedHead = test.reverseK(head, 3);
//        System.out.println("reversedHead next: " + reversedHead);
//        test.printListIterative(reversedHead);
        System.out.println("-".repeat(50));
        Node groupReverse = test.reverseGroup(head, 3);
        test.printListIterative(groupReverse);
        System.out.println("-".repeat(50));
        /*head = test.deleteAtEnd(head);
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
        System.out.println("list 2");
        list2 = test.insertAtX(list2, 56, 0);
        test.printListIterative(list2);
        System.out.println(test.search(list2, 46));
        System.out.println("reverse the linked list");
        Node reversedList2 = test.reverse(list2);
        test.printListIterative(reversedList2);

        Node list3 = test.insertAtEnd(null, 3);
        list3 = test.insertAtEnd(list3, 13);
        test.printListIterative(list3);
        list3 = test.deleteAtBegin(list3);
        test.printListIterative(list3);

        Node list4 = test.insertAtBegin(null, 5);
        test.printListIterative(    list4);
        System.out.println("After removing");
        list4 = test.deleteAtEnd(list4);
        test.printListIterative(list4);*/
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

    public Node insertAtX(Node head, int x, int position) {
        Node node = new Node(x);
        if (position == 0 && head == null) return node;
        if (position == 0 && head != null) {
            node.next = head;
            return node;
        }
        Node current = head;
        Node pre = head;
        int counter = 0;
        while (current != null && counter < position) {
            pre = current;
            current = current.next;
            ++counter;
        }
        node.next = current;
        pre.next = node;
        return head;
    }

    public Node deleteAtBegin(Node head) {
        if (head == null) return null;
        Node nextNode = head.next;
        head = null;
        return nextNode;
    }

    public Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) return null;
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return head;
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

    public void printMiddle(Node head) {
    }

    public Node reverse(Node head) {
        if (head == null) return null;
        Node current = head;
        Node pre = null, next;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public Node reverseK(Node head, int k) {
        Node current = head, previous = null, next;
        int counter = 0;
        while (current != null && counter < k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            counter++;
        }
        return previous;
//        return current;
    }

    public Node reverseGroup(Node head, int k) {
        Node current = head, previous = null, next = null;
        int counter = 0;
        while (current != null) {
//            next = current.next;
            while (current != null && counter < k) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
                counter++;
            }
            System.out.println("current: " + current + " next: " + next);
//            current = current.next;
        }
        return null;
    }

    public Node reverseRecursive(Node current, Node previous) {
        if (current == null) return previous;
        Node next = current.next;
        current.next = previous;
        return reverseRecursive(next, current);
    }

    public Node sortedInsert(Node head, int key) {
        Node node = new Node(key);
        if (head == null) return node;
        if (key < head.data) {
            node.next = head;
            return node;
        }
        Node current = head, pre = null;
        while (current != null && current.data <= key) {
            pre = current;
            current = current.next;
        }
        node.next = current;
        pre.next = node;
        return head;
    }

    public void removeDuplicate(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}
