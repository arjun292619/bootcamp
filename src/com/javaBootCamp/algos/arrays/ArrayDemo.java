package com.javaBootCamp.algos.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] array1 = {5, 8, 20, 10};
        int[] array2 = {40, 8, 50, 100};
        int[] array3 = {10, 20, 20, 30, 30, 30, 40};
        int[] array4 = {5, 20, 12,20,8};

        //get largest from array
        System.out.println(arrayDemo.getLargest(array1));
        System.out.println(arrayDemo.getLargest(array2));
        //second largest from array
        System.out.println(arrayDemo.secondLargest(array4));

        //remove duplicates
        arrayDemo.remDuplicate(array3);
        System.out.println(Arrays.toString(array3));


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

    public int secondLargest(int[] arr) {
        int largest = 0, second = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                second = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (second == -1 || arr[i] > arr[second]) {
                    second = i;
                }
            }
        }
        return arr[second];
//        return second;
    }

    public int findMajorityElement() {
        return -1;
    }

    public void remDuplicate(int[] array) {
        //[10,20,30,30,30,40]
        int nd = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[nd - 1] != array[i]) {
                array[nd] = array[i];
                nd++;
            }
        }
    }
}
