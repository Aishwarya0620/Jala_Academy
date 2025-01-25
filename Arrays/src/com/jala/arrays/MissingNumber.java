package com.jala.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10}; // Missing 8
        System.out.println("Missing number: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;  // Sum of first n numbers
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return sum - arrSum;
    }
}
