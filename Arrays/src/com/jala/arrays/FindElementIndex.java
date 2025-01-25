package com.jala.arrays;

public class FindElementIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = findIndex(arr, 30);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int findIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;  // Element not found
    }
}

