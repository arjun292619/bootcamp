package com.javaBootCamp.hashmap_section20;

import java.util.*;

public class HashmapDemo {
    public static void main(String[] args) {
//        Initilize Map
        Map<String, String> countriesMap = new HashMap<>();
        countriesMap.put("India", "New Delhi");
        countriesMap.put("UK", "London");
        countriesMap.put("USA", "London");
        countriesMap.put("China", "Beijing");
        countriesMap.put("Japan", "Tokyo");
        countriesMap.put("Italy", "Rome");
        countriesMap.put("Netherlands", "Amsterdam");
        countriesMap.put("Singapore", "Singapore");
        countriesMap.put("Australia", "Canberra");
        countriesMap.put("New Zealand", "Wellington");
        countriesMap.put("Egypt", "Cairo");
        countriesMap.put(null, null);
// print the map
        System.out.println(countriesMap);

//        get the values from map
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.get("USA"));
        countriesMap.remove(null);
        System.out.println(countriesMap.size());


//        Iterating a hashmap
        System.out.println("Iterating with keyset");
        Set<String> keys = countriesMap.keySet();

        for (String country : keys) {
            System.out.println(country + ":" + countriesMap.get(country));
        }

        System.out.println("Iterating with Entryset");
        Set<Map.Entry<String, String>> entries = countriesMap.entrySet();
        Iterator<Map.Entry<String, String>> mapIterator = entries.iterator();

        System.out.println("\nUsing iterator to iterate a map & entry set");
        while (mapIterator.hasNext()) {
            Map.Entry<String, String> entry = mapIterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " :- " + value);
        }
        System.out.println("\nUsing values to iterate");
        Collection<String> valueSet = countriesMap.values();
        for (String value : valueSet) {
            System.out.println(value);
        }
    }
}
