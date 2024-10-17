package com.javaBootCamp.algos.sorting;

import java.util.Comparator;

public class CustomEvenOddComp implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        int result = a % 2 - b % 2;
        if (result == 0) {
            result = a - b;
        }
        return result;
    }
}
