package com.javaBootCamp.arrays_section12;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
//        double[] prices = new double[4];
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        String[] names = {"Arthur", "Robert", "Henry"};
        Person[] persons = new Person[3];
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(intArray[0]);
        System.out.println(grades[1]);
        intArray[4] = 10;
        System.out.println(Arrays.toString(intArray));

        int length = 25;
        int[] mobileNmbrs = new int[length * 2];
        System.out.println(Arrays.toString(mobileNmbrs));
        System.out.println("\n" + mobileNmbrs.length);

        for (int i = 0; i < mobileNmbrs.length; i++) {
            mobileNmbrs[i] = i * i;
        }
        System.out.println(Arrays.toString(mobileNmbrs));
//        empty array
        int[] emptyArray = new int[0];
        System.out.println(emptyArray.length);

//        enhanced for loop/for-each loop
        for (int nmbr : mobileNmbrs) {
            System.out.println(nmbr);
        }

//        for each loop to print names
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

//        making copies of arrays
//        copying using a loop
        String[] namesCopy = new String[5];
        for (int i = 0; i < names.length; i++) {
            namesCopy[i] = names[i];
        }
        System.out.println(Arrays.toString(namesCopy));
//        copying using system utils
        int[] mobileCopy = new int[length];
        System.arraycopy(mobileNmbrs, 1, mobileCopy, 0, 20);
        System.out.println(Arrays.toString(mobileCopy));

//        copy using Arrays util
        char[] gradesCopy = Arrays.copyOf(grades, 8);
        System.out.println(Arrays.toString(gradesCopy));

//        Sorting arrays .sort and parallel sort
        Random random = new Random(System.currentTimeMillis());
        double[] prices = new double[10];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = random.nextDouble(5);
        }
        System.out.println(Arrays.toString(prices));
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

//        searching for a number
        int[] nums = {36, 9, 42, 18, 75, 1000};
        System.out.println("original array: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("array after sorting " + Arrays.toString(nums));

        int indexOf42 = Arrays.binarySearch(nums, 42);
        System.out.println(indexOf42);
        int indexOf250 = Arrays.binarySearch(nums, 25);
        System.out.println(indexOf250);

        int[] scores = new int[15];
        Arrays.fill(scores, 10);
        System.out.println(Arrays.toString(scores));
//        multiDimensional/nested arrays
//        int[][] twoDArray = new int[2][3];
        int[][] twoDarray = {
                {1, 3, 5},
                {2, 4, 6}
        };
        System.out.println(twoDarray[0][0]);
        System.out.println(twoDarray[1][2]);
        System.out.println(Arrays.toString(twoDarray[0]));

        int[][] twoDarray1 = {
                {4, 7, 9},
                {5, 7, 0}
        };
        int[][] twoDarray2 = {
                {3, 8, 2},
                {2, 6, 1}
        };

        int[][] sumArray = new int[twoDarray1.length][twoDarray1[0].length];
        for (int i = 0; i < twoDarray1.length; i++) {
            for (int j = 0; j < twoDarray1[0].length; j++) {
                sumArray[i][j] = twoDarray1[i][j] + twoDarray2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(sumArray));

        //        jagged Array
        int[][] jaggedArray1 = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9},
                {10}
        };
        System.out.println(Arrays.deepToString(jaggedArray1));

        int[][] jaggedArray2 = new int[4][];
        int counter = 10;
        for (int i = 0; i < jaggedArray2.length; i++) {
            jaggedArray2[i] = new int[jaggedArray2.length - i];
            for (int j = 0; j < jaggedArray2[i].length; j++) {
                counter++;
                jaggedArray2[i][j] = counter;
            }
        }
        System.out.println(Arrays.deepToString(jaggedArray2));


    }
}
