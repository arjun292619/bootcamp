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

    public void recursiveSuggest(TrieNode root, String prefix) {
        if (root.isEnd) {
            System.out.println(prefix);
        }
        if (!hasChildNode(root)) return;
        for (int i = 0; i < TrieNode.getDefaultSize(); i++) {
            if (root.children[i] != null) {
                prefix += (char) (97 + i);
                recursiveSuggest(root.children[i], prefix);
            }
        }

    }

    public int printAutoSuggestions(String query) {
        TrieNode current = root;
        for (int i = 0; i < query.length(); i++) {
            int index = query.charAt(i) - 'a';
            if (current.children[index] == null) {
                return 0;
            }
            current = current.children[index];
        }
        boolean isEndofWord = current.isEnd;
        boolean hasChildren = hasChildNode(current);

        if (isEndofWord && !hasChildren) {
            System.out.println(query);
            return -1;
        }
        if (hasChildren) {
            String prefix = query;
            recursiveSuggest(current, prefix);
            return 1;
        }
        return 0;

    }
}
