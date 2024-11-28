package com.javaBootCamp.hashSet_section21;

import java.util.HashSet;
import java.util.Iterator;
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
        visitedCountries.add("South Korea");
        visitedCountries.add("Russia");
        visitedCountries.add("Brazil");
        visitedCountries.add("Denmark");
        System.out.println(visitedCountries.size());
        System.out.println(visitedCountries);

        boolean isFrance = visitedCountries.contains("France");
        boolean isSingapore = visitedCountries.contains("Singapore");
        boolean delJapan = visitedCountries.remove("Japan");
        System.out.println(visitedCountries);

        Iterator<String> iterator = visitedCountries.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            System.out.println(country.toUpperCase());
//            if (country.contains("u")) {
            if (country.matches("a")) {
                iterator.remove();
            }
        }

        System.out.println(visitedCountries);

    }
}
