package com.jala.arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];  // Second last element
    }
}


