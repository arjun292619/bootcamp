package com.javaBootCamp.algos.sorting;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        return o1.y() - o2.y();
    }
}
