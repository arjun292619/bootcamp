package com.javaBootCamp.linkedLists_section18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.addAll(List.of(47, 43, 67, 92, 3, -67, -2, 0));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        List<String> countryNames = new LinkedList<String>();
        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Canada");
        countryNames.add("Germany");
        countryNames.add("France");
        countryNames.addAll(List.of("Spain", "Mexico", "Norway"));

        System.out.println(countryNames);
        countryNames.sort(Comparator.naturalOrder());
        System.out.println(countryNames);

        countryNames.sort(new LastCharComparator());
        System.out.println(countryNames);
    }
}
