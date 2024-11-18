package com.javaBootCamp.algos.arrays.naive;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] array1 = {5, 8, 20, 10};
        int[] array2 = {40, 8, 50, 100};
        int[] array3 = {5, 20, 30, 80};
        int[] array7 = {1, 2, 3, 5, 6};
        int[] array9 = {7, 10, 4, 3, 10, 6, 5, 2};
        int[] array10 = {0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
        int[] array12 = {2, 3, 10, 6, 4, 8, 1};
        int[] array13 = {-3, 8, -2, 4, -5, 6};
        int[] array14 = {3, 4, 8, -9, 9, 7};


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

        //        print leaders in array
        arrayDemo.leaders(array9);
        System.out.println();

        int result = arrayDemo.getSum(array9, 2, 6);
        System.out.println(result);

//        Maximum consecutive ones
        int max1s = arrayDemo.maxConsecutiveOnes(array10);
        System.out.println(max1s);

//        Maximum difference in order
        System.out.println("Max Difference: " + arrayDemo.maxDiff(array12));

        //        Maximum Sum subarray
        System.out.println("Max Sum subarray: " + arrayDemo.maxSumSubarray(array12));

        //        Equlibrium point
        System.out.println("Is equlibrium point " + arrayDemo.equlibriumPoint(array14));

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

    public void leaders(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(array[i] + " ");
        }
    }

    public int getSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int maxConsecutiveOnes(int[] array) {
//        {0,1,1,0,1,1,1}
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }

    public int maxKsum(int[] array, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < i - k + 1; i++) {
            //        {0,1,1,0,1,1,1}
            int currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum += array[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public int maxDiff(int[] array) {
//        {2,3,10,6,4,8,1}
        int maxDifference = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int currentDiff = array[j] - array[i];
                maxDifference = Math.max(maxDifference, currentDiff);
            }
        }
        return maxDifference;
    }

    public int maxSumSubarray(int[] array) {
//        {1,-2,3,-1,2}
        int maxSum = array[0];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public boolean equlibriumPoint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lSum = 0;
            int rSum = 0;
            for (int j = i - 1; j >= 0; j--) {
                lSum += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                rSum += array[j];
            }

            if (lSum == rSum) return true;
        }
        return false;
    }
}
