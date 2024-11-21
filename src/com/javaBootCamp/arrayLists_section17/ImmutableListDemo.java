package com.javaBootCamp.arrayLists_section17;

import java.util.ArrayList;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        List<Integer> accountNums = new ArrayList<>();
        accountNums.add(235789);
        accountNums.add(346791);
        accountNums.add(558901);

//        accountNums = Collections.unmodifiableList(accountNums);
        List<Integer> immutableList = List.of(235789, 346791, 558901);
        var mutableList = new ArrayList<Integer>(immutableList);

        add10Dollars(accountNums);
//        add10Dollars(immutableList);
        add10Dollars(mutableList);


    }

    private static List<Integer> add10Dollars(List<Integer> accounts) {
        accounts.add(569345);
        for (int account : accounts) {
            System.out.println("10$ credited to " + account);
        }
        return accounts;
    }
}
