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

        Map<Integer, String> numberMapper = new TreeMap<>();
        numberMapper.put(13, "thirteen");
        numberMapper.put(19, "ninteen");
        numberMapper.put(27, "twentty seven");
        numberMapper.put(3, "three");
        numberMapper.put(48, "forty eight");
        numberMapper.put(1, "one");
        numberMapper.put(17, "seventeen");
        numberMapper.put(33, "thirty three");
        numberMapper.put(50, "fifty");
        numberMapper.put(20, "twenty");

        System.out.println(numberMapper);

        for (Integer key : numberMapper.keySet()) {
            System.out.println(key + " : " + numberMapper.get(key));
        }

        LinkedHashMap<Integer, String> linkedMapper = new LinkedHashMap<>();
        linkedMapper.put(13, "thirteen");
        linkedMapper.put(19, "ninteen");
        linkedMapper.put(27, "twentty seven");
        linkedMapper.put(3, "three");
        linkedMapper.put(48, "forty eight");
        linkedMapper.put(1, "one");
        linkedMapper.put(17, "seventeen");
        linkedMapper.put(33, "thirty three");
        linkedMapper.put(50, "fifty");
        linkedMapper.put(20, "twenty");

        System.out.println(linkedMapper);

        for (Map.Entry<Integer, String> entry : linkedMapper.entrySet()) {
            System.out.println(entry.getKey() + ":-" + entry.getValue());
        }

        var reversedMap = linkedMapper.reversed();
        System.out.println(reversedMap);

    }
}
