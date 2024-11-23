package com.javaBootCamp.hashSet_section21;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> visitedCountries = new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("France");
        visitedCountries.add("Greece");
        visitedCountries.add("Iceland");
        visitedCountries.add("UK");
        visitedCountries.add("Japan");
        visitedCountries.add("Japan");
        System.out.println(visitedCountries.size());
        System.out.println(visitedCountries);

        boolean isFrance = visitedCountries.contains("France");
        boolean isSingapore = visitedCountries.contains("Singapore");
        boolean delJapan = visitedCountries.remove("Japan");
        System.out.println(visitedCountries);

    }
}
