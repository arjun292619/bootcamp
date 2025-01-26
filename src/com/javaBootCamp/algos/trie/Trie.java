package com.javaBootCamp.algos.trie;

public class Trie {
    private TrieNode root = new TrieNode();

    public TrieNode getRoot() {
        return root;
    }

    public void insert(String word) {
        TrieNode current = root;
        int length = word.length();
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }

    public boolean search(String key) {
        TrieNode current = root;
        int length = key.length();
        for (int i = 0; i < length; i++) {
            int index = key.charAt(i) - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEnd;
    }

    public boolean hasChildNode(TrieNode node) {
        for (int i = 0; i < node.children.length; i++) {
            if (node.children[i] != null) {
                return true;
            }
        }
        return false;
    }

    public TrieNode recurDelete(TrieNode root, String key, int index) {
        if (root == null) return null;

        if (index == key.length()) {
            root.isEnd = false;
            if (!hasChildNode(root)) {
                root = null;
            }
            return root;
        }

        int i = key.charAt(index) - 'a';
        root.children[i] = recurDelete(root.children[i], key, index + 1);
        if (!hasChildNode(root) && !root.isEnd) {
            root = null;
        }
        return root;
    }

    public void delete(String key) {
        recurDelete(root, key, 0);
    }
}
