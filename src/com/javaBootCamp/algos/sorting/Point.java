package com.javaBootCamp.algos.sorting;

import java.util.Comparator;

public record Point(int x, int y) implements Comparable<Point>{
    @Override
    public int compareTo(Point point) {
        return x - point.x();
    }
}
