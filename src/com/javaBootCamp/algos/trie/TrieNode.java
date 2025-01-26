package com.javaBootCamp.algos.trie;

public class TrieNode {
    private static int DEFAULT_SIZE = 26;
    public TrieNode[] children = new TrieNode[DEFAULT_SIZE];
    public boolean isEnd;

//    public TrieNode(int[] children, boolean isEnd) {
//        this.children = children;
//        this.isEnd = isEnd;
//    }
}
