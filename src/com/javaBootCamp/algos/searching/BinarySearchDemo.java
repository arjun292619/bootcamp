package com.javaBootCamp.algos.searching;

import java.rmi.dgc.VMID;

public class BinarySearchDemo {
    public static void main(String[] args) {
        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        int[] sample1 = {10, 20, 30, 40, 50, 60};
//        Iterative Binary Search
        int index1 = binarySearchDemo.bSearchIterative(sample1, 20);
        System.out.println("result found at index: " + index1);

        //        Recursive Binary Search
        int index2 = binarySearchDemo.bSearchIterative(sample1, 40);
        System.out.println("result found at index: " + index2);
    }

    public int bSearchIterative(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid;
    }

    public int bSearchRecursive(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = (high + low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return bSearchRecursive(arr, key, low, mid - 1);
        } else {
            return bSearchRecursive(arr, key, mid + 1, high);
        }
    }
}
