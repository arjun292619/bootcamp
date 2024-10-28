package com.javaBootCamp.algos.sorting;

import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        Sorts sorts = new Sorts();
        int[] input1 = {64, 2, 45, 76, 32, 24, 49, 19, 98, 57};
        int[] input2 = {48, 2, 45, 67, 32, 56, 49, 29, 5, 23};

        System.out.println("Before Sort: " + Arrays.toString(input1));
        sorts.bubbleSort(input1);
        System.out.println("After Bubble Sort: " + Arrays.toString(input1));
        sorts.selectionSort(input2);
        System.out.println("After Selection Sort: " + Arrays.toString(input2));

    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void bubbleSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    swap(inputArray, j, j + 1);
                }
            }
        }
    }

    public void selectionSort(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            int lowest = i;
            for (int j = i; j < inputArr.length; j++) {
                if (inputArr[j] < inputArr[lowest]) {
                    lowest = j;
                }
            }
            swap(inputArr, i, lowest);
        }
    }

    public void insertionSort(int[] inputArr) {
    }
}
