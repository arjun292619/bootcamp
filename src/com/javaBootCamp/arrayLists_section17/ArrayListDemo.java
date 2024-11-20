package com.javaBootCamp.arrayLists_section17;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(67, 34, 68, 90, 12, -2, 45, -54, 23, 86, 23, 79, 100, 34, -65, -87, 59, 75));
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
        countries.add("Denmark");
        countries.add("Belgium");
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

//        Sorting the data in array lists
        System.out.println("before sorting");
        System.out.println(nums);
        System.out.println("After sorting-Ascending");
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("After sorting-Descending");
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println(nums);

        System.out.println("before sorting Countries");
        System.out.println(countries);
        System.out.println("After sorting Countries");
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries);

//        using custom comparator
        countries.sort(new LastCharComparator());
        System.out.println(countries);

//        custom comparable on custom data

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mark", 125678, 120));
        students.add(new Student("Derek", 245674, 110));
        students.add(new Student("Tony", 355679, 135));
        students.add(new Student("Natasha", 465668, 124));
        students.add(new Student("Jeremy", 575973, 112));
        students.add(new Student("Bruce", 585063, 122));
        students.add(new Student("Bruce", 585062, 122));
        students.add(new Student("Alfred", 684271, 102));
        students.add(new Student("Clark", 692953, 132));
//        Students before sorting
        System.out.println(students);
//        Students after sorting
        Collections.sort(students);
        System.out.println(students);
        students.sort(new StudentComparator());
        System.out.println(students);

    }
}
