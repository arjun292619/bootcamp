package com.javaBootCamp.hashSet_section21;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        set1.add(4);
        set1.add(2);
        set1.add(6);
        set1.add(8);
        set1.add(10);
        set1.add(1);

        set2.add(5);
        set2.add(9);
        set2.add(7);
        set2.add(3);
        set2.add(6);
        set2.add(1);

        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(5);
        set3.add(6);
        set3.add(7);
        set3.add(8);
        set3.add(9);
        set3.add(10);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set3: " + set3);
//        set1.addAll(set2);
        System.out.println("Union: " + set1);
//        set2.retainAll(set1);
        System.out.println("Intersection: " + set2);
//        set1.removeAll(set3);
//        set3.removeAll(set1);
        System.out.println("Difference: " + set3);
        System.out.println("Difference: " + set1);

        System.out.println(set1.containsAll(set3));
        System.out.println(set3.containsAll(set1));


    }
}
