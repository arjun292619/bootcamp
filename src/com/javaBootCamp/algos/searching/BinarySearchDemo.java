package com.javaBootCamp.algos.searching;

public class BinarySearchDemo {
    public static void main(String[] args) {
        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        int[] sample1 = {10, 20, 30, 40, 50, 60};
        int index1 = binarySearchDemo.bSearchIterative(sample1, 20);
        System.out.println("result found at index: " + index1);
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
}
