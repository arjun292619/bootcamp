package com.javaBootCamp.algos.arrays.naive;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] array1 = {5, 8, 20, 10};
        int[] array2 = {40, 8, 50, 100};
        System.out.println(arrayDemo.getLargest(array1));
        System.out.println(arrayDemo.getLargest(array2));
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
}
