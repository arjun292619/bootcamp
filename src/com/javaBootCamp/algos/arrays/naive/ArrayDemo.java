package com.javaBootCamp.algos.arrays.naive;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] array1 = {5, 8, 20, 10};
        int[] array2 = {40, 8, 50, 100};
        int[] array3 = {5, 20, 30, 80};
        int[] array7 = {1, 2, 3, 5, 6};
        System.out.println(arrayDemo.getLargest(array1));
        System.out.println(arrayDemo.getLargest(array2));

        //Array is ascending
        System.out.println(arrayDemo.isAscending(array1));
        System.out.println(arrayDemo.isAscending(array3));

        //        Left rotate array by 1
        System.out.println(Arrays.toString(array7));
        arrayDemo.lRotateOne(array7);
        System.out.println(Arrays.toString(array7));

        //        Left rotate array by n
        System.out.println(Arrays.toString(array7));
        arrayDemo.leftRotateN(array7, 2);
        System.out.println(Arrays.toString(array7));

    }

    public int getLargest(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    public int removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int index = 1;
        temp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {
                temp[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            array[i] = temp[i];
        }
        return index;
    }

    public int findMajorityElement() {
        return -1;
    }

    public boolean isAscending(int[] array) {
        boolean isSorted = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    return isSorted;
                }
            }
        }
        isSorted = true;
        return isSorted;
    }

    public void lRotateOne(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
    }

    public void leftRotateN(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            lRotateOne(array);
        }
    }
}
