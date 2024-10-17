package com.javaBootCamp.algos.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr1 = {5, 20, 12, 30, 48, 3, 68};
        char[] arr2 = {'v', 'b', 'z', 'p', 'k', 'm', 'h'};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {25, 30, 120, 10, 49, 53, 12};
        Arrays.sort(arr3, 1, 6);
        System.out.println(Arrays.toString(arr3));

        Point[] points = new Point[]{new Point(10, 20), new Point(3, 12), new Point(5, 7), new Point(8, 5)};

        System.out.println("points before sorting");
        System.out.println(Arrays.toString(points));
        Arrays.sort(points);
        System.out.println(Arrays.toString(points));
        System.out.println("With Custom Comparator");
        Arrays.sort(points, new PointComparator());
        System.out.println(Arrays.toString(points));

//        Reverse Order
        Integer[] arr4 = {25, 30, 120, 10, 49, 53, 12};
        Arrays.sort(arr4, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr4));

        Arrays.sort(arr4, new CustomEvenOddComp());
        System.out.println(Arrays.toString(arr4));

    }
}
