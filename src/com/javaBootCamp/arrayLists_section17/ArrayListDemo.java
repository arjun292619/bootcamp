package com.javaBootCamp.arrayLists_section17;

import java.util.*;

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
//        countries.clear();
//        System.out.println(countries);

//        Iteraring the lists
        System.out.println("Iterating with advanced for each loop");
        for (String country : countries) {
            System.out.println(country);
        }

        System.out.println("Iterating with regular for each loop");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(i + ". " + countries.get(i));
        }

        System.out.println("Iterating with Iterator");
        Iterator<String> countryIterator = countries.iterator();
        while (countryIterator.hasNext()) {
            String name = countryIterator.next();
            System.out.println(name);
            if (name.equalsIgnoreCase("Mexico")) {
                countryIterator.remove();
            }
        }
        System.out.println(countries);


        System.out.println("Iterating forwards with ListIterator");
        ListIterator<String> listIterator = countries.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("Iterating backwards with ListIterator");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }
}
