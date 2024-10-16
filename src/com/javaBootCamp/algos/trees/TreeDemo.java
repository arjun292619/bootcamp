package com.javaBootCamp.algos.trees;

public class TreeDemo {
    public static void main(String[] args) {
        TreeDemo treeDemo = new TreeDemo();
        Node root = new Node(10);
        root.setLeft(new Node(20));
        root.setRight(new Node(30));
        root.getLeft().setLeft(new Node(40));
        root.getLeft().setRight(new Node(50));
        root.getLeft().getLeft().setLeft(new Node(70));
        root.getLeft().getRight().setRight(new Node(80));
        root.getRight().setLeft(new Node(60));
        root.getRight().setRight(new Node(70));
//        root.getRight().getLeft().setRight(new Node(80));

        System.out.println("Pre Order Traversal");
        treeDemo.preOrderTraversal(root);
        System.out.println("In Order Traversal");
        treeDemo.inOrderTraversal(root);
        System.out.println("Post Order Traversal");
        treeDemo.postOrderTraversal(root);
        System.out.println("Height of binary tree root: " + treeDemo.heightOfBinaryTree(root));

        System.out.println("Print at k nodes");
        treeDemo.printAtK(root, 2);
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

    public int heightOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(heightOfBinaryTree(root.getLeft()), heightOfBinaryTree(root.getRight()));
        }
    }

    public void printAtK(Node root, int k) {
        if (root == null) return;
        if (k == 0) {
            System.out.print(root.getValue() + " ");
        } else {
            printAtK(root.getLeft(), k - 1);
            printAtK(root.getRight(), k - 1);
        }
    }
}
