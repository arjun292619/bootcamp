package com.javaBootCamp.algos.trees;

public class TreeDemo {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.setLeft(new Node(20));
        root.setRight(new Node(30));
        root.getLeft().setLeft(new Node(40));
        root.getLeft().setRight(new Node(50));
        root.getRight().setLeft(new Node(60));
        root.getRight().setRight(new Node(70));
    }
}
