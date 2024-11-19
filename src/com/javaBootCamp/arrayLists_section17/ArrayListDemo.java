package com.javaBootCamp.arrayLists_section17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        String first = countries.getFirst();
        System.out.println(first);
        String last = countries.getLast();
        System.out.println(last);
        Random random = new Random();
        String randomCountry = countries.get(random.nextInt(0, countries.size()));
        System.out.println(randomCountry);

//        reversed instance pf the list
        List<String> reversed = countries.reversed();
        System.out.println(reversed);

//        clearing the arraylist
        countries.clear();
        System.out.println(countries);


    }
}
