package com.javaBootCamp.algos.trie;

import java.util.Arrays;

public class TrieDemo {
    public static void main(String[] args) {
        TrieNode example = new TrieNode();
//        System.out.println(Arrays.toString(example.children));
//        System.out.println(example.isEnd);

        Trie root = new Trie();
//        root.insert("bc");

        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their", "zebra", "zoo"};

        // Construct trie
        for (int i = 0; i < keys.length; i++) {
            root.insert(keys[i]);
        }

        System.out.println(Arrays.toString(root.getRoot().children));

        System.out.println(root.search("zebra"));
        System.out.println(root.search("bye"));
        System.out.println(root.search("there"));
        System.out.println(root.search("these"));
        System.out.println(root.search("zoo"));
        root.delete("zoo");
        System.out.println(root.search("zoo"));


    }
}
