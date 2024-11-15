package com.javaBootCamp.linkedLists_section18;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListiteration {
    public static void main(String[] args) {
        List<String> countryNames = new LinkedList<String>();
        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Canada");
        countryNames.add("Germany");
        countryNames.add("France");
        countryNames.addAll(List.of("Spain", "Mexico", "Norway"));

        //using for each loop
        for (String name : countryNames) {
            System.out.println("Country: " + name.toUpperCase());
        }

        //using iterator
        Iterator<String> iterator = countryNames.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            System.out.println("Country:- " + country.toLowerCase());
        }

//        using list iterator
        ListIterator<String> listIterator = countryNames.listIterator();
        while (listIterator.hasNext()) {
            String country = listIterator.next();
            System.out.println("Country=" + country);
        }

//        using traditional for loop
        for (int i = 0; i < countryNames.size(); i++) {
            System.out.println(i + "." + countryNames.get(i));
        }
    }
}
