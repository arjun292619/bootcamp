package com.javaBootCamp.algos.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] array1 = {5, 8, 20, 10};
        int[] array2 = {40, 8, 50, 100};
        int[] array3 = {10, 20, 20, 30, 30, 30, 40};
        int[] array4 = {5, 20, 12, 20, 8};
        int[] array5 = {10, 5, 7, 30};
        int[] array6 = {5, 20, 30, 80};
        int[] array7 = {1, 2, 3, 5, 6};
        int[] array8 = {2, 3, 0, 5, 0, 0, 0, 6, 8, 0};

        //get largest from array
        System.out.println(arrayDemo.getLargest(array1));
        System.out.println(arrayDemo.getLargest(array2));
        //second largest from array
        System.out.println(arrayDemo.secondLargest(array4));

        //remove duplicates
        arrayDemo.remDuplicate(array3);
        System.out.println(Arrays.toString(array3));

        //reverse an array
        System.out.println(Arrays.toString(array5));
        arrayDemo.reverse(array5);
        System.out.println(Arrays.toString(array5));

        //check if array is ascending
        System.out.println(arrayDemo.isAscending(array1));
        System.out.println(arrayDemo.isAscending(array6));

//        Left rotate array by 1
        System.out.println(Arrays.toString(array7));
        arrayDemo.lRotateOne(array7);
        System.out.println(Arrays.toString(array7));

        //        Left rotate array by 2
        System.out.println(Arrays.toString(array7));
        arrayDemo.leftRotateN(array7, 3);
        System.out.println(Arrays.toString(array7));

//        Move zeros to end
        System.out.println(Arrays.toString(array8));
        arrayDemo.moveZeros(array8);
        System.out.println(Arrays.toString(array8));


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

    public boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
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

    public void reverse(int[] array) {
        int start = 0, end = array.length - 1, temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public void lRotateOne(int[] array) {
        //{1,2,3,4,5} input
        //{2,3,4,5,1} output
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
    }

    public void leftRotateN(int[] array, int n) {
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = array[i];
        }

        for (int i = n; i < array.length; i++) {
            array[i - n] = array[i];
        }

        for (int i = 0; i < n; i++) {
            array[array.length - n + i] = temp[i];
        }
    }

    public void moveZeros(int[] array) {
//        {2,3,0,5,0,0,0,6,8,0}
//        {2,3,5,6,8,0,0,0,0,0}
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }

    }
}
