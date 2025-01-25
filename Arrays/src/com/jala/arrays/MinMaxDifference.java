package com.jala.arrays;

public class MinMaxDifference {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Difference between largest and smallest: " + findDifference(arr));
    }

    public static int findDifference(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }
}
