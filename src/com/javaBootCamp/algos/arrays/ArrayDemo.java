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
        int[] array8 = {2, 3, 0, 5, 0, 0, 0, 6, 8, 0, 6};
        int[] array9 = {7, 10, 4, 3, 10, 6, 5, 2};
        int[] array10 = {10, 10, 10, 25, 30, 30, 45, 45};
        int[] array11 = {0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
        int[] array12 = {2, 3, 10, 6, 4, 8, 1};
        int[] array13 = {-3, 8, -2, 4, -5, 6};
        int[] array14 = {3, 4, 8, -9, 9, 7};
        int[] array15 = {5, 10, 20, 6, 3, 8};


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

        //        print leaders in array
        arrayDemo.leaders(array9);
        System.out.println();

        // getSum
        int result = arrayDemo.getSum(array9, 2, 6);
        System.out.println(result);

//        print the frequency of elements
        arrayDemo.printFrequency(array10);

        //        Maximum consecutive ones
        int max1s = arrayDemo.maxConsecutiveOnes(array11);
        System.out.println(max1s);

        //        Maximum difference in order
        System.out.println("Max Difference: " + arrayDemo.maxDiff(array12));

        //        Maximum sum subarray
        System.out.println("Max Sum Subarray: " + arrayDemo.maxSumSubarray(array13));

        //        Equlibrium point
        System.out.println("Is equlibrium point " + arrayDemo.equlibriumPoint(array14));

        //        Maximum length of even odd subbarray
        System.out.println("Max Even Odd subarray: " + arrayDemo.maxEvenOddLength(array15));

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

    public void leaders(int[] array) {
//        {7, 10, 4, 3, 10, 6, 5, 2};
        int currentLeader = array[array.length - 1];
        System.out.print(currentLeader + " ");
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > currentLeader) {
                System.out.print(array[i] + " ");
                currentLeader = array[i];
            }
        }
    }

    public int[] prefixSum(int[] array) {
        int[] ps = new int[array.length];
        ps[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            ps[i] = array[i] + ps[i - 1];
        }
        return ps;
    }

    public int getSum(int[] array, int start, int end) {
        int[] presum = prefixSum(array);
        if (start == 0) {
            return presum[end];
        } else {
            return presum[end] - presum[start - 1];
        }

    }

    public void printFrequency(int[] array) {
//        {10,10,10,30,30,40}
        int index = 1, freq = 1, length = array.length;
        while (index < length) {
            while (index < length && array[index - 1] == array[index]) {
                freq++;
                index++;
            }
            System.out.println(array[index - 1] + " : " + freq);
            index++;
            freq = 1;
        }
        if (length == 1 || array[length - 2] != array[length - 1]) {
            System.out.println(array[length - 1] + " : " + freq);

        }
    }

    public int maxConsecutiveOnes(int[] array) {
        //        {0,1,1,0,1,1,1}
        int maxCount = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count = 0;
            } else {
                count++;
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }

    public int maxKsum(int[] array, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += array[i];
        }
        int maxSum = currentSum;
        for (int i = k; i < array.length; i++) {
            currentSum = currentSum + array[i] - array[i - k];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public int maxDiff(int[] array) {
        //        {2,3,10,6,4,8,1}
        int minVal = array[0];
        int maxD = array[1] - array[0];
        for (int i = 0; i < array.length; i++) {
            maxD = Math.max(maxD, array[i] - minVal);
            minVal = Math.min(minVal, array[i]);
        }
        return maxD;
    }

    public int maxSumSubarray(int[] array) {
        int maxSubSum = array[0];
        int globalMax = array[0];
        for (int i = 0; i < array.length; i++) {
            maxSubSum = Math.max(array[i], maxSubSum + array[i]);
            globalMax = Math.max(maxSubSum, globalMax);
        }
        return globalMax;
    }

    public boolean equlibriumPoint(int[] array) {
        int rSum = 0;
        for (int i = 0; i < array.length; i++) {
            rSum += array[i];
        }
        int lSum = 0;
        for (int i = 0; i < array.length; i++) {
            rSum -= array[i];
            if (lSum == rSum) {
                return true;
            }
            lSum += array[i];
        }
        return false;
    }

    public boolean isSubarraySum(int[] array, int target) {
        int start = 0, windowSum = 0;
        for (int end = 0; end < array.length; end++) {
            windowSum += array[end];
            while (windowSum > target) {
                windowSum -= array[start];
                start++;
            }
            if (windowSum == target) {
                return true;
            }
        }
        return false;
    }

    public int maxEvenOddLength(int[] array) {
        int maxLength = 1, count = 1;
        for (int i = 1; i < array.length; i++) {
            if ((array[i] % 2 == 0 && array[i - 1] % 2 != 0) || (array[i] % 2 != 0 && array[i - 1] % 2 == 0)) {
                count++;
                maxLength = Math.max(maxLength, count);
            } else {
                count = 1;
            }
        }
        return maxLength;
    }
}
