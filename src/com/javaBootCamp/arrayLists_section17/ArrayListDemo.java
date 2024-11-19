package com.javaBootCamp.arrayLists_section17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<String> countries = new ArrayList<>();
        var doubles = new ArrayList<Double>();
        System.out.println(countries.size());
        countries.add("India");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Germany");
        countries.add("India");
        countries.add("Mexico");
        countries.add("UK");
        System.out.println(countries);
        countries.add(2, "France");
        System.out.println(countries);
        countries.set(4, "Spain");
        countries.remove(5);
        countries.remove("France");
        System.out.println(countries);

    }
}
