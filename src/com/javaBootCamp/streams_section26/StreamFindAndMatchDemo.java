package com.javaBootCamp.streams_section26;

import java.util.List;
import java.util.Optional;

public class StreamFindAndMatchDemo {
    public static void main(String[] args) {
        List<Item> items = getItems();
        boolean allInStock = items.stream().allMatch(Item::inStock);
        System.out.println(allInStock);

        boolean anyOnSale = items.stream().anyMatch(Item::onSale);
        System.out.println(anyOnSale);

        boolean anyOutOfStock = items.stream().anyMatch(item -> !item.inStock());
        System.out.println(anyOutOfStock);

        Optional<Item> filteredItem = items.stream().filter(item -> item.price() > 10000).findAny();
        System.out.println(filteredItem.isPresent() ? filteredItem.get().name() : "None");

        Optional<Item> filteredItem1 = items.stream().filter(item -> item.price() > 1000).findFirst();
        System.out.println(filteredItem1.get());
    }

    private static List<Item> getItems() {
        return List.of(
                new Item("Laptop", 1200, true, false),
                new Item("Smartphone", 1199, true, true),
                new Item("headphone", 399, false, true),
                new Item("camera", 3400, true, true),
                new Item("smartwatch", 799, true, true),
                new Item("tv", 3200, true, false)
        );
    }
}
