package com.javaBootCamp.linkedLists_section18;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        var countryNames = new LinkedList<String>();
        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Canada");
        countryNames.add("Germany");
        countryNames.push("France");
        countryNames.addAll(List.of("Spain", "Mexico", "Norway"));

        System.out.println(countryNames.toString());
        System.out.println(countryNames.peekFirst());
        countryNames.set(0, "Japan");
        System.out.println(countryNames.toString());
        countryNames.remove("India");
        String firstElement = countryNames.getFirst();
        String lastElement = countryNames.getLast();
        System.out.println(countryNames.toString());
        List<String> reversedCountryNames = countryNames.reversed();
        System.out.println(reversedCountryNames);
    }
}
