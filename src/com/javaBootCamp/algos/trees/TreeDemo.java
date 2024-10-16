package com.javaBootCamp.algos.trees;

public class TreeDemo {
    public static void main(String[] args) {
        TreeDemo treeDemo = new TreeDemo();
        Node root = new Node(10);
        root.setLeft(new Node(20));
        root.setRight(new Node(30));
        root.getLeft().setLeft(new Node(40));
        root.getLeft().setRight(new Node(50));
        root.getRight().setLeft(new Node(60));
        root.getRight().setRight(new Node(70));
        System.out.println("Pre Order Traversal");
        treeDemo.preOrderTraversal(root);
        System.out.println("In Order Traversal");
        treeDemo.inOrderTraversal(root);
        System.out.println("Post Order Traversal");
        treeDemo.postOrderTraversal(root);
    }

    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.getLeft());
            System.out.println("Node: " + root.getValue());
            inOrderTraversal(root.getRight());
        }
    }

    public void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.println("Node: " + root.getValue());
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }

    public void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.println("Node: " + root.getValue());
        }
    }
}
